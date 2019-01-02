package com.lrg.star.model.character;

import java.util.List;

import com.lrg.d20.model.character.attribute.Attribute;
import com.lrg.d20.model.character.classes.BaseD20Character;
import com.lrg.d20.model.character.classes.CharacterClassLevel;
import com.lrg.d20.rules.RuleSet;

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
