package com.lrg.star.model;

public abstract class RechargeableContainer extends BaseContainerObjectImpl
{
    protected int max, current, rechargeRate;
    
    protected RechargeableContainer(String parentName)
    {
        this.parentName = parentName;
    }
    

    public int getMax()
    {
        return max;
    }

    public void setMax(int max)
    {
        this.max = max;
    }

    public int getCurrent()
    {
        return current;
    }

    public void setCurrent(int current)
    {
        this.current = current;
    }

    public int getRechargeRate()
    {
        return rechargeRate;
    }

    public void setRechargeRate(int rechargeRate)
    {
        this.rechargeRate = rechargeRate;
    }
    
    public void heartbeat()
    {
        if (current < max)
        {
            current += rechargeRate;
        }
        
        if (current > max)
        {
            current = max;
        }
    }
    
    public void setContainerName(String name)
    {
        this.containerName = name;
    }

    public void setContainerUse(String use)
    {
        this.containerUse = use;
    }

    public String getContainerName()
    {
        return containerName;
    }

    public String getContainerUse()
    {
        return containerUse;
    }
    
}
