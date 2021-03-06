package com.lrg.star.model.starship;

import java.util.List;

import com.lrg.base.model.BaseInteractableObject;
import com.lrg.base.model.Inertia;
import com.lrg.base.model.Mass;
import com.lrg.star.CosmicEntity;
import com.lrg.star.ShipSystem;

public abstract class Starship extends BaseInteractableObject implements CosmicEntity
{
    protected List<ShipSystem> systems;
    
    public void heartbeat()
    {
        super.heartbeat();
        updateSystems();
        mass.heartbeat();
    }
    
    private void updateSystems()
    {
        systems.forEach((s)->s.heartbeat());
    }
    
    public Starship()
    {
        mass.setInertia(Inertia.noneInertia());
    }

    @Override
    public Mass getMass()
    {
        return this.mass;
    }
    
    public List<ShipSystem> getSystems()
    {
        return systems;
    }

    public void setSystems(List<ShipSystem> systems)
    {
        this.systems = systems;
    }
    
    public void setName(String name)
    {
        super.setName(name);
    }
}
