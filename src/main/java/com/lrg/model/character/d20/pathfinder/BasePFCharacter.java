package com.lrg.model.character.d20.pathfinder;

import com.lrg.model.character.d20.BaseD20Character;
import com.lrg.model.character.rules.RuleSet;

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