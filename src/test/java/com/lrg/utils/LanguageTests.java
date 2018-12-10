package com.lrg.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class LanguageTests
{

    @Test
    public void objectsThatAreStringsReturnTheirStringValueWhenToStringIsCalled()
    {
        Object empty = new Object();
        // Prints out something like "java.lang.Object@108c4c35"
        System.out.println(empty);
        
        Object o = "HEY";
        // Prints out "HEY"
        System.out.println(o);
        
        String heyMaybe = o.toString();
        
        // Prints out "HEY"
        System.out.println(heyMaybe);
    }

}
