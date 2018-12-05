package com.lrg.star.model.character;

import java.util.List;

import com.lrg.model.character.d20.Attribute;
import com.lrg.model.character.d20.BaseD20Character;
import com.lrg.model.character.d20.CharacterClass;
import com.lrg.model.character.rules.RuleSet;

public class BaseStarCharacter extends BaseD20Character
{

    @Override
    public RuleSet getRuleSet()
    {
        if (ruleSet == null)
        {
            ruleSet = new StarfinderRuleSet();
        }
        return this.ruleSet;
    }

}
