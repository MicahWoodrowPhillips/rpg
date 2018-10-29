package com.lrg.model.character.d20;

import java.util.List;

public class Modifier
{
    int value;
    List<Object> influencers;
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }
    public List<Object> getInfluencers()
    {
        return influencers;
    }
    public void setInfluencers(List<Object> influencers)
    {
        this.influencers = influencers;
    }
    
    

}
