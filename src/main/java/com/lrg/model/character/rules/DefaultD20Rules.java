package com.lrg.model.character.rules;

import java.util.List;
import java.util.Map;

import com.lrg.model.character.d20.CharacterClass;
import com.lrg.model.character.d20.Skill;

/**
 * Default rules for playing generic D20-based games.  Uses 6-attribute characters, skills have no max/min, etc.  Like other rules sets, much of the character comes from its class(es).
 * @author wphillips
 *
 */
public class DefaultD20Rules extends RuleSet
{
    public static final String NAME = "D20_DEFAULT";
    private Map<CharacterClass, List<Skill>> classSkills;
    @Override
    public int getMaxSkillRanks()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int getClassSkillBonus(int ranks)
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
