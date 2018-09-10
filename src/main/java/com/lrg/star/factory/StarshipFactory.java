package com.lrg.star.factory;

import java.util.List;

import com.lrg.star.ShipSystem;
import com.lrg.star.model.Mass;
import com.lrg.star.model.Starship;

public class StarshipFactory
{
    private String name;
    private List<ShipSystem> systems;

    public StarshipFactory named(String name)
    {
        this.name = name;
        return this;
    }
    
    public StarshipFactory withSystem(ShipSystem system)
    {
        this.systems.add(system);
        return this;
    }
    
    public StarshipFactory withSystems(List<ShipSystem> systems)
    {
        this.systems.addAll(systems);
        return this;
    }
    
    public Starship build()
    {
        Starship starship = new Starship() {};
        
        starship.setSystems(systems);
        starship.setName(name);

        return starship;
    }

}
