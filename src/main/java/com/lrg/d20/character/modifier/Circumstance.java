package com.lrg.d20.character.modifier;

public class Circumstance
{
    private CircumstanceType matcher;
    private int priority;
    
    /**
     * Describes a situation that can cause a bonus to be given.
     * 
     * @return
     */
    public CircumstanceType getMatcher()
    {
        return matcher;
    }
    public void setMatcher(CircumstanceType matcher)
    {
        this.matcher = matcher;
    }
    
    /**
     * Some circumstances are more important/recent/powerful than others and do not stack.  These bonuses require hierarchy.
     * 
     * @return
     */
    public int getPriority()
    {
        return priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }

}
