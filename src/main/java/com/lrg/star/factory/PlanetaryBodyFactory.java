package com.lrg.star.factory;

import java.util.HashMap;
import java.util.List;

import com.lrg.star.enums.CosmicType;
import com.lrg.star.enums.PeriodicElement;
import com.lrg.star.model.BasePlanetaryBody;
import com.lrg.star.model.Mass;
import com.lrg.star.model.Population;
import com.lrg.star.model.Ring;
import com.lrg.star.model.Satellite;

public class PlanetaryBodyFactory
{
    private BasePlanetaryBody lastBody;
    private String name;
    private Mass mass;
    private HashMap<PeriodicElement, Double> elements;
    private List<Population> populations;
    private Integer techLevel;
    private Integer tempKelvin;
    private List<Satellite> satellites;
    private List<Ring> rings;
    private Double volume;
    private CosmicType type;
    
    public BasePlanetaryBody build()
    {
        lastBody = new BasePlanetaryBody(name, mass, elements, populations, techLevel, tempKelvin, satellites, rings, volume, type);
        return lastBody;
    }
    
    public BasePlanetaryBody getLastBody()
    {
        return lastBody;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMass(Mass mass)
    {
        this.mass = mass;
    }

    public void setElements(HashMap<PeriodicElement, Double> elements)
    {
        this.elements = elements;
    }

    public void setPopulations(List<Population> populations)
    {
        this.populations = populations;
    }

    public void setTechLevel(Integer techLevel)
    {
        this.techLevel = techLevel;
    }

    public void setTempKelvin(Integer tempKelvin)
    {
        this.tempKelvin = tempKelvin;
    }

    public void setSatellites(List<Satellite> satellites)
    {
        this.satellites = satellites;
    }

    public void setRings(List<Ring> rings)
    {
        this.rings = rings;
    }

    public void setVolume(Double volume)
    {
        this.volume = volume;
    }

    public void setType(CosmicType type)
    {
        this.type = type;
    }
    
    
}
