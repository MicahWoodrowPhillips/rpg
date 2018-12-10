package com.lrg.base.model;

public class Energy extends RechargeableContainer
{
    protected Energy(String parentName)
    {
        super(parentName);
    }
    
    public String getName()
    {
        return name + " belonging to " + parentName;
    }

    @Override
    public void setName(String name)
    {
        this.name = "Energy of type " + name;
    }

    

}
