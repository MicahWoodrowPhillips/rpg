package com.lrg.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * CsvReader <p />
 * 
 * Reads in a file and keeps a copy of its contents.  If you have no marker to constrain by,<br>
 * leave it null or blank and the reader will assume the file is flat with no markers.
 */
public class CsvReader
{
    private String csvFileLocation;
    private String line;
    private Set<String> contents;

    private final String DELIMITER = ",";
    private boolean hasValidFile = false;

    public CsvReader(String csvFileLocation)
    {
        this.csvFileLocation = csvFileLocation;
        hasValidFile = injestFlat();
    }
    
    public CsvReader(String csvFileLocation, String marker)
    {
        this.csvFileLocation = csvFileLocation;
        hasValidFile = injestByConstraintValuePair(marker);
    }
    
    public List<String> getContents()
    {
        return new ArrayList<>(contents);
    }
    
    public boolean injestByConstraintValuePair(String marker)
    {
        boolean useAllMarkers = StringUtils.isBlank(marker);
        
        BufferedReader br = null;
        
        contents = new HashSet<>();
        try
        {
            br = getBufferedReader();
            while ((line = br.readLine()) != null)
            {
                List<String> pair = Arrays.asList(line.split(DELIMITER));
                
                if (useAllMarkers || marker.equals(pair.get(0)))
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
    
    private BufferedReader getBufferedReader()
    {
        InputStream is = getClass().getClassLoader().getResourceAsStream(this.csvFileLocation);
        return new BufferedReader(new InputStreamReader(is));
    }

    private boolean injestFlat()
    {
        BufferedReader br = null;
        contents = new HashSet<String>();
        try
        {
            this.csvFileLocation = csvFileLocation;
            br = getBufferedReader();
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
        if (!hasValidFile)
        {
            return 0;
        }
        return contents.size();
    }
    
    public boolean getHasValidFile()
    {
        return hasValidFile;
    }

}
