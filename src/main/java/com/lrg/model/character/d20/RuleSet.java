package com.lrg.model.character.d20;

import java.util.List;

import com.lrg.model.character.d20.Rule.RuleEvaluator;

/**
 * The set of rules governing pieces of the d20 system in question.  For instance, Pathfinder <br>
 * characters have different allocations for their skills than in DnD 3.5+.   For that matter, <br>
 * DnD versions each have different rules for things like AC, skills, feats, etc.
 */
public class RuleSet
{
    
    
    private static final Rule SKILL_RULE_SET = new Rule(RuleEvaluator.SKILLS);
    private List<Rule> rulesList;
    
    public int getMaxSkillRanks()
    {
        if (rulesList.contains(SKILL_RULE_SET))
        {
            
        }
        
        return 0;
    }
    

}
