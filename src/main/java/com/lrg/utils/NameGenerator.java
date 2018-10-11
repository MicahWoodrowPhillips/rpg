package com.lrg.utils;

import java.util.Random;

public class NameGenerator
{
    // TODO Create male, female and either firstname documents with ~1500 names each.
    // TODO Create config with those names pulled in from file, instead of referencing the files here.
    
    private static final String FNAMES = "C:\\Users\\wphillips.PAYFONE\\eclipse-workspace-lrg\\rpg\\src\\main\\resources\\fnames.csv";
    private static Random rand = new Random();

    public String generateFirstName(NameGenerator.Sex sex)
    {
        return generateFirstName(sex.value).trim();
    }

    
    public static String generateFirstName(int sex)
    {
        if (sex < 0)
        {
            return maleFirstName();
        }
        else if (sex == 0)
        {
            return eitherFirstName();
        }
        else
        {
            return femaleFirstName();
        }
    }

    private static String femaleFirstName()
    {
        // TODO Change these
        CsvReader csvReader = new CsvReader(FNAMES);
        return maleFirstName();
    }

    private static String eitherFirstName()
    {
        // TODO Change these
        CsvReader csvReader = new CsvReader(FNAMES);
        return maleFirstName();
    }

    private static String maleFirstName()
    {
        CsvReader csvReader = new CsvReader(FNAMES);
        return csvReader.getContents().get(rand.nextInt(csvReader.getSize()));
    }

    public enum Sex
    {
        MALE(-1), EITHER(0), FEMALE(1);
        
        private int value;

        Sex(int a)
        {
            this.value = a;
        }
    }
}
