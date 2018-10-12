package com.lrg.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CsvReader <p />
 * 
 * Only use the no-args CTOR if you are specifically planning to invoke the 
 * injestFlat or other injest functions explicitly, because it will come 
 * with a null contents var.
 */
public class CsvReader
{
    private String csvFileLocation;
    private String line;
    private List<String> contents;

    private final String DELIMITER = ",";
    
    CsvReader()
    {}
    
    /**
     * This CTOR runs the {@code com.lrg.utils.CsvReader.injestFlat(String)} to fulfill its contents requirements.
     * 
     * @param csvFileLocation
     */
    public CsvReader(String csvFileLocation)
    {
        injestFlat(csvFileLocation);
    }
    
    public CsvReader(String csvFileLocation, String marker)
    {
        injestByConstraintValuePair(csvFileLocation, marker);
    }
    
    public List<String> getContents()
    {
        return contents;
    }
    
    public boolean injestByConstraintValuePair(String csvFileLocation, String marker)
    {
        BufferedReader br = null;
        
        contents = new ArrayList<>();
        try
        {
            this.csvFileLocation = csvFileLocation;
            br = new BufferedReader(new FileReader(this.csvFileLocation));
            while ((line = br.readLine()) != null)
            {
                List<String> pair = Arrays.asList(line.split(DELIMITER));
                
                if (marker.equals(pair.get(0)))
                {
                    contents.add(pair.get(1));
                }
            }
            
        }
        catch(FileNotFoundException e)
        {
            // logger.error(e);
            e.printStackTrace();
            return false;
        }
        catch (IOException e)
        {
            // logger.error(e);
            e.printStackTrace();
            return false;
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean injestFlat(String csvFileLocation)
    {
        BufferedReader br = null;
        contents = new ArrayList<>();
        try
        {
            this.csvFileLocation = csvFileLocation;
            br = new BufferedReader(new FileReader(this.csvFileLocation));
            while ((line = br.readLine()) != null)
            {
                contents.addAll(Arrays.asList(line.split(DELIMITER)));
            }
            
        }
        catch(FileNotFoundException e)
        {
            // logger.error(e);
            e.printStackTrace();
            return false;
        }
        catch (IOException e)
        {
            // logger.error(e);
            e.printStackTrace();
            return false;
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int getSize()
    {
        return contents.size();
    }

}
