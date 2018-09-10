package com.lrg.star.model;

import java.util.List;

import com.lrg.star.Interactable;

public class BaseInteractableObject extends BaseObjectImpl implements Interactable
{
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




}
