package com.lrg.d20.model.character.classes;

import java.util.List;

import com.lrg.d20.character.JournalEntry;

public class TextAttributes
{
    private String firstName;
    private String lastName;
    private String hairColor;
    private String eyeColor;
    private String physicalDescription;
    private String personalityDescription;
    private List<JournalEntry> journal;
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getHairColor()
    {
        return hairColor;
    }
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    public String getEyeColor()
    {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    public String getPhysicalDescription()
    {
        return physicalDescription;
    }
    public void setPhysicalDescription(String physicalDescription)
    {
        this.physicalDescription = physicalDescription;
    }
    public String getPersonalityDescription()
    {
        return personalityDescription;
    }
    public void setPersonalityDescription(String personalityDescription)
    {
        this.personalityDescription = personalityDescription;
    }
    public List<JournalEntry> getJournal()
    {
        return journal;
    }
    public void setJournal(List<JournalEntry> journal)
    {
        this.journal = journal;
    }
    
    

}
