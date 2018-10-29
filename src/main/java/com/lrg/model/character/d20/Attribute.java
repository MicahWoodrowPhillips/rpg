package com.lrg.model.character.d20;

import com.lrg.model.character.Rules;

public class Attribute
{
    private String name;
    private short value;
    private short modifier;

    public Attribute(String name)
    {
        this(name, new DefaultD20Rules());
        
    }
    
    public Attribute(String name, Rules rules)
    {
        this.name = name;
        applyRules(rules);
    }
    
    private int applyRules(Rules rules)
    {
        // Should include some logging, in case we ever mix rulesets.
        
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
