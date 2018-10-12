package com.lrg.utils;

import java.util.List;
import java.util.Random;

public class NameGenerator
{
    // TODO Create config with those names pulled in from file, instead of referencing the files here.

    private static final String FNAMES = "C:\\Users\\wphillips.PAYFONE\\eclipse-workspace-lrg\\rpg\\src\\main\\resources\\fnames.csv";
    private static final String LNAMES = "C:\\Users\\wphillips.PAYFONE\\eclipse-workspace-lrg\\rpg\\src\\main\\resources\\lnames.csv";
    private static Random rand = new Random();

    private static CsvReader csvReaderFirstNamesMale = null;
    private static CsvReader csvReaderFirstNamesFemale = null;
    private static CsvReader csvReaderLastNames = null;

    public static String generateFirstName(NameGenerator.Sex sex)
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
        ensureFirstNamesLoaded();
        if (csvReaderFirstNamesFemale == null)
        {
            return "Jen";
        }
        return csvReaderFirstNamesFemale.getContents().get(rand.nextInt(csvReaderFirstNamesFemale.getSize()));
    }

    private static String eitherFirstName()
    {
        ensureFirstNamesLoaded();
        int which = rand.nextInt(2);
        if (which == 0)
            return maleFirstName();
        else
            return femaleFirstName();
    }

    private static String maleFirstName()
    {
        ensureFirstNamesLoaded();
        if (csvReaderFirstNamesMale == null)
        {
            return "John";
        }
        return csvReaderFirstNamesMale.getContents().get(rand.nextInt(csvReaderFirstNamesMale.getSize()));
    }

    public static String generateLastName()
    {
        ensureLastNamesLoaded();
        List<String> lNames = csvReaderLastNames.getContents();
        return lNames.get(rand.nextInt(lNames.size()));
    }

    private static void ensureLastNamesLoaded()
    {
        if (csvReaderLastNames == null)
        {
            csvReaderLastNames = new CsvReader(LNAMES);
        }
    }

    private static void ensureFirstNamesLoaded()
    {
        if (csvReaderFirstNamesMale == null)
        {
            csvReaderFirstNamesMale = new CsvReader(FNAMES, "B");
        }
        
        if (csvReaderFirstNamesFemale == null)
        {
            csvReaderFirstNamesFemale = new CsvReader(FNAMES, "G");
        }
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
