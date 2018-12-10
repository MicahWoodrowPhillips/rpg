package com.lrg.d20.rules;

import java.util.ArrayList;
import java.util.List;

public class Rule
{

    private List<RuleType> evaluations;
    
    private Rule()
    {
        evaluations = new ArrayList<RuleType>();
    }
    
    public Rule(RuleType ... listOfRules)
    {
        this();
        for (RuleType r : listOfRules)
        {
            evaluations.add(r);
        }
    }

    public String getSituations()
    {
        StringBuffer sb = new StringBuffer();
        evaluations.stream().forEach(sb::append);
        return sb.toString();
    }
    
    
    public enum RuleType
    {
        COMBAT, CONVERSATION, SPELLCASTING, LEVELING_UP, SAME_AS_LEVEL, LEVEL_MINUS_ONE, HALF_LEVEL, 
        ROUNDS_UP, ROUNDS_DOWN, WHOLE_ONLY, SKILLS;
        
        public String toStringComma()
        {
            return this.toString() + ",";
        }
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((evaluations == null) ? 0 : evaluations.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        
        if (obj == null)
            return false;
        
        if (getClass() != obj.getClass())
            return false;
        
        Rule other = (Rule) obj;

        if (evaluations == null)
        {
            if (other.evaluations != null)
                return false;
            else
                return true;
        }
        
        else if (other.evaluations == null)
        {
            return false;
        }
        
        else if (evaluations.size() != other.evaluations.size() || !evaluations.containsAll(other.evaluations))
        {
            return false;
        }
        
        return true;
    }
}
