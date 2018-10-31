package com.lrg.star.model.starship;

import java.util.List;

import com.lrg.star.ShipSystem;
import com.lrg.star.model.BaseInteractableObject;
import com.lrg.star.model.Energy;
import com.lrg.star.model.Health;
import com.lrg.star.model.Mass;

public class BaseShipSystemImpl extends BaseInteractableObject implements ShipSystem 
{
    private String name, description;
    private Health health;
    private Energy energy;


    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void heartbeat()
    {
        health.heartbeat();
        energy.heartbeat();
    }
    
    
    public int getHealthCurrent()
    {
        return health.getCurrent();
    }

    public int getHealthMax()
    {
        return health.getMax();
    }



    public float getEnergyCurrent()
    {
        return 0;
    }

    public float getEnergyMax()
    {
        return 0;
    }

    public List<ShipSystem> getConnectedSystems()
    {
        return null;
    }

    public String getDescription()
    {
        return null;
    }
    
    @Override
    public Mass getMass()
    {
        return this.mass;
    }


}