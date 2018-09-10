package com.lrg.star;

import java.util.List;

@FunctionalInterface
public interface Interactable
{
    public <T extends Interactable> List<T> interact(T t);
}
