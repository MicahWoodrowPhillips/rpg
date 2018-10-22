package com.lrg.model.character;

import java.util.List;

public abstract class CharacterClass
{
    private String name;
    List<Level> levels;
    
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
}
