package com.lrg.base.model;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseContainerObjectImpl extends BaseObjectImpl
{
    protected String containerName;
    protected String containerUse;

    public abstract String getContainerName();
    public abstract String getContainerUse();
    
    @Override
    public String getDescription()
    {
        if (StringUtils.isEmpty(fullDescription))
        {
            StringBuffer sb = new StringBuffer();
            sb.append(getContainerName());
            sb.append(" is part of ");
            sb.append(parentName);
            sb.append(" to perform the following actions: ");
            sb.append(getContainerUse());
            
            fullDescription = sb.toString();
        }
        return fullDescription;
    }

}
