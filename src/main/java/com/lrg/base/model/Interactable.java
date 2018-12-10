package com.lrg.base.model;

import java.util.List;

@FunctionalInterface
public interface Interactable
{
    public <T extends Interactable> List<T> interact(T t);
}
