package com.lrg.utils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class NameGenerator
{
    private static Logger logger = LoggerFactory.getLogger(NameGenerator.class);

    private String namesPath;
    private List<String> namesList;
    
    private Random rand = new Random();

    private String constraint;

    public NameGenerator(String namesPath, String constraint)
    {
        this.namesPath = namesPath;
        this.constraint = constraint;
    }
    
    public String generateName()
    {
        ensureNamesLoaded();
        return namesList.get(rand.nextInt(namesList.size()));
    }
    
    private void ensureNamesLoaded()
    {
        if (namesList == null) 
        {
            CsvReader csvReader = new CsvReader(namesPath, constraint);
            if (!csvReader.getHasValidFile())
            {
                logger.error("Cannot find file at " + namesPath);
            }
            else
            {
                namesList = csvReader.getContents().stream().map(String::trim).collect(Collectors.toList());
            }
        }
        
    }

}
