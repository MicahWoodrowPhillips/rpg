package com.lrg.d20.character.pathfinder;

import com.lrg.d20.model.character.classes.BaseD20Character;
import com.lrg.d20.rules.RuleSet;

public abstract class BasePFCharacter extends BaseD20Character
{
    
    
    @Override
    public RuleSet getRuleSet()
    {
        if (ruleSet == null)
        {
            ruleSet = new PathfinderRuleSet();
        }
        return this.ruleSet;
    }

    
}