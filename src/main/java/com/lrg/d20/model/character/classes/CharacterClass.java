package com.lrg.d20.model.character.classes;

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