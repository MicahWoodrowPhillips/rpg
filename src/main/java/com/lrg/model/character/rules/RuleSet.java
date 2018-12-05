package com.lrg.model.character.rules;

import java.util.Map;

import com.lrg.model.character.rules.Rule.RuleType;

/**
 * The set of rules governing pieces of the d20 system in question.  For instance, Pathfinder <br>
 * characters have different allocations for their skills than in DnD 3.5+.   For that matter, <br>
 * DnD versions each have different rules for things like AC, skills, feats, etc.
 */
public abstract class RuleSet
{
    private Map<RuleType, Rule> rules;
    
    public abstract int getMaxSkillRanks();

    public abstract int getClassSkillBonus(int ranks);
    

}
