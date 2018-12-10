package com.lrg.d20.model.character.attribute;

import org.springframework.beans.factory.annotation.Autowired;

import com.lrg.d20.character.modifier.Modifier;
import com.lrg.d20.combat.Influential;
import com.lrg.d20.rules.DefaultD20Rules;
import com.lrg.d20.rules.MasterRuleSet;
import com.lrg.d20.rules.RuleSet;

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
     * @see com.lrg.d20.rules.DefaultD20Rules
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
