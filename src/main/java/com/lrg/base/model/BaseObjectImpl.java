package com.lrg.base.model;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseObjectImpl implements BaseObject
{
    protected String name;
    protected String parentName;
    protected String fullDescription;

    public abstract void heartbeat();
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription()
    {
        if (StringUtils.isEmpty(fullDescription))
        {
            StringBuffer sb = new StringBuffer();
            sb.append(getName());
            sb.append(" is part of ");
            sb.append(parentName);
            
            fullDescription = sb.toString();
        }
        return fullDescription;
    }

}
