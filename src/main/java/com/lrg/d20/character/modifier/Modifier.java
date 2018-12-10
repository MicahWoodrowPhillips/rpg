package com.lrg.d20.character.modifier;

import java.util.HashSet;
import java.util.Set;

import com.lrg.d20.combat.Influential;

/**
 * Represents a total modifier, which can be influenced potentially many other sources.
 * 
 * @author wphillips
 *
 */
public class Modifier
{
    private int value;
    private Set<Influential> influencers;
    
    
    public Modifier(Influential influentialObject)
    {
        addInfluence(influentialObject);
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }
    public Set<Influential> getInfluencers()
    {
        return influencers;
    }
    public void setInfluencers(Set<Influential> influencers)
    {
        this.influencers = influencers;
    }
    public void addInfluence(Influential influentialObject)
    {
        if (influencers == null)
            influencers = new HashSet();
        
        influencers.add(influentialObject);
        
    }
}
