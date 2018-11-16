package com.lrg.model.character.d20;

import com.lrg.model.character.Rules;

public class Attribute implements Influential
{
    private String name;
    private int value;
    private Modifier modifier;
    private Rules rules;


    /**
     * Default Attribute uses default d20 rules.
     * 
     * @see com.lrg.model.character.d20.DefaultD20Rules
     * @param name
     */
    public Attribute(String name)
    {
        this(name, new DefaultD20Rules());
        
    }
    
    public Attribute(String name, Rules rules)
    {
        this.name = name;
        this.rules = rules;
        this.modifier = new Modifier(this);
    }
    
    public int getValue()
    {
        return value;
    }

    public void setValue(short value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }
    public Modifier getModifier()
    {
        return modifier;
    }
}
