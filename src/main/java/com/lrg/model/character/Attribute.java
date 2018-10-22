package com.lrg.model.character;

public class Attribute
{
    private String name;
    private short value;
    private short modifier;

    public Attribute(String name)
    {
        this.name = name;
    }
    
    private int applyRules(Rules rules)
    {
        return rules.conform(value);
    }

    public short getValue()
    {
        return value;
    }

    public void setValue(short value)
    {
        this.value = value;
    }

    public short getModifier()
    {
        return modifier;
    }

}
