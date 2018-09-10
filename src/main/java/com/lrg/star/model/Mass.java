package com.lrg.star.model;

public class Mass extends BaseObjectImpl
{
    private Inertia inertia;
    private double value_kg;
    
    
    public Inertia getInertia()
    {
        return inertia;
    }
    public void setInertia(Inertia inertia)
    {
        this.inertia = inertia;
    }
    public double getValue_kg()
    {
        return value_kg;
    }
    public void setValue_kg(double value_kg)
    {
        this.value_kg = value_kg;
    }
    @Override
    public void heartbeat()
    {
        updateInertiaValues();
        inertia.heartbeat();
    }
    
    private void updateInertiaValues()
    {
    }
}
