package com.lrg.base.model;

import java.util.List;

public abstract class BaseInteractableObject extends BaseObjectImpl implements Interactable
{
    protected Mass mass;
    public <T extends Interactable> List<T> interact(T t)
    {
        return null;
    }

    @Override
    public void heartbeat()
    {
    }

    @Override
    public String getName()
    {
        return "An object that can be interacted with in some way.";
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    public abstract Mass getMass();


}
