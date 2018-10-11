package com.lrg.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.lrg.utils.NameGenerator.Sex;

public class NameGeneratorTest
{
    private NameGenerator testObject = null;
    
    @Before
    public void setup()
    {
        testObject = new NameGenerator();
    }
    
    @Test
    public void testMaleFName()
    {
        
        String name = testObject.generateFirstName(Sex.MALE);
        
        assertNotNull(name);
        assertNotEquals(name, testObject.generateFirstName(Sex.MALE));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testFemaleFName()
    {
        String name = testObject.generateFirstName(Sex.FEMALE);
        assertNotNull(name);
        assertNotEquals(name, testObject.generateFirstName(Sex.FEMALE));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
    
    @Test
    public void testEitherFName()
    {
        String name = testObject.generateFirstName(Sex.EITHER);
        assertNotNull(name);
        assertNotEquals(name, testObject.generateFirstName(Sex.EITHER));
        assertFalse(name.startsWith(" "));
        assertFalse(name.endsWith(" "));
    }
}
