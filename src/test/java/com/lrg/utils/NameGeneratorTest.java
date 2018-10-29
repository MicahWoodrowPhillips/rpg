package com.lrg.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class NameGeneratorTest
{
    
    private String firstNamePath;
    private String lastNamePath;
    
    @Before
    public void setup()
    {
        firstNamePath = "fnames.csv";
        lastNamePath = "lnames.csv";    
    }

    @Test
    public void testMaleFName()
    {
        NameGenerator nameGenerator = new NameGenerator(firstNamePath, "B");
        String name = nameGenerator.generateName();
        
        assertNotNull(name);
        assertNotEquals(name, nameGenerator.generateName());
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testFemaleFName()
    {
        NameGenerator nameGenerator = new NameGenerator(firstNamePath, "G");
        String name = nameGenerator.generateName();
        
        assertNotNull(name);
        assertNotEquals(name, nameGenerator.generateName());
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testEitherFName()
    {
        NameGenerator nameGenerator = new NameGenerator(firstNamePath, "");
        String name = nameGenerator.generateName();
        
        assertNotNull(name);
        assertNotEquals(name, nameGenerator.generateName());
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testLastName()
    {
        NameGenerator nameGenerator = new NameGenerator(lastNamePath);
        String name = nameGenerator.generateName();
        
        assertNotNull(name);
        assertNotEquals(name, nameGenerator.generateName());
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void nameDumpTest()
    {
        HashSet<String> set = new HashSet<String>();
        
        NameGenerator nameGenerator = new NameGenerator(firstNamePath, "");
        String name;
        
        for(int i = 0; i < 10000; i++)
        {
            name = nameGenerator.generateName();
            
            System.out.println(name + " is name number " + (i+1));
            
            if(!set.add(name))
            {
                System.out.println("\n" + name + " already existed.  " + i + " unique names generated in total.");
                break;
            }
        }
    }
}
