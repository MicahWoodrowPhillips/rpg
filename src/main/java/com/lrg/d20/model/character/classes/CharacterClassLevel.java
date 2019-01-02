package com.lrg.d20.model.character.classes;

public abstract class CharacterClassLevel
{
    private String name;
    private int levelValue;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    protected abstract int getLevelValue();
    
}
