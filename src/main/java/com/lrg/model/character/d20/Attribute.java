package com.lrg.model.character.d20;

import org.springframework.beans.factory.annotation.Autowired;

import com.lrg.model.character.rules.DefaultD20Rules;
import com.lrg.model.character.rules.MasterRuleSet;
import com.lrg.model.character.rules.RuleSet;

public class Attribute implements Influential
{
    @Autowired
    private MasterRuleSet masterRuleSet;
    private String name;
    private int value;
    private Modifier modifier;
    private RuleSet ruleSet;


    /**
     * Default Attribute uses default d20 rules.
     * 
     * @see com.lrg.model.character.rules.DefaultD20Rules
     * @param name
     */
    public Attribute(String name)
    {
        this(name, DefaultD20Rules.NAME);
        
    }
    
    public Attribute(String name, String rulesName)
    {
        this.name = name;
        this.ruleSet = masterRuleSet.getRules(rulesName);
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
