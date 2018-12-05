package com.lrg.model.character.rules;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * Container for holding all currently held
 * 
 * @author wphillips
 *
 */
@Component
public class MasterRuleSet
{
    private Map<String, RuleSet> rules;
    
    public MasterRuleSet()
    {
        rules = new HashMap();
    }
    
    public boolean hasRuleSet(String name)
    {
        return rules.containsKey(name);
    }

    public RuleSet getDefaultD20Rules()
    {
        RuleSet retRules = null;
        if(hasRuleSet(DefaultD20Rules.NAME))
        {
            rules.put(DefaultD20Rules.NAME, new DefaultD20Rules());
        }
        else
        {
            retRules = new DefaultD20Rules();
        }
        
        return retRules;
    }

    public RuleSet getRules(String name)
    {
        return rules.get(name);
    }
}
