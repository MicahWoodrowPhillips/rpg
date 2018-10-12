package com.lrg.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.lrg.utils.NameGenerator.Sex;

public class NameGeneratorTest
{
    
    @Test
    public void testMaleFName()
    {
        
        String name = NameGenerator.generateFirstName(Sex.MALE);
        
        assertNotNull(name);
        assertNotEquals(name, NameGenerator.generateFirstName(Sex.MALE));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testFemaleFName()
    {
        String name = NameGenerator.generateFirstName(Sex.FEMALE);
        assertNotNull(name);
        assertNotEquals(name, NameGenerator.generateFirstName(Sex.FEMALE));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testEitherFName()
    {
        String name = NameGenerator.generateFirstName(Sex.EITHER);
        assertNotNull(name);
        assertNotEquals(name, NameGenerator.generateFirstName(Sex.EITHER));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testLastName()
    {
        String name = NameGenerator.generateLastName();
        assertNotNull(name);
        assertNotEquals(name, NameGenerator.generateLastName());
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void nameDumpTest()
    {
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < 10000; i++)
        {
            String name = NameGenerator.generateFirstName(0);
            
            System.out.println(name + " is name number " + i);
            
            if(!set.add(name))
            {
                System.out.println(name + " already existed.  " + (i-1) + " unique names generated in total.");
                break;
            }
        }
    }
}
