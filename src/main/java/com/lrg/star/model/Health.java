package com.lrg.star.model;

public class Health extends RechargeableContainer
{
    protected Health(String parentName)
    {
        super(parentName);
    }

    public String getName()
    {
        return "Health of " + parentName;
    }

    @Override
    public void setName(String name)
    {
        //no-op
    }

}
