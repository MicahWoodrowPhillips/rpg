package com.lrg.star.model;

import java.util.HashMap;
import java.util.List;

import com.lrg.star.enums.CosmicType;
import com.lrg.star.enums.PeriodicElement;
import com.lrg.star.model.starship.Satellite;

public class BasePlanetaryBody extends CosmicBody implements MassiveBody
{
    private HashMap<PeriodicElement, Double> elements;
    private List<Population> populations;
    private Integer overallTechLevel;
    private Integer tempKelvin;
    private List<Satellite> satellites;
    private List<CelestialRing> rings;
    private Double volume;
    private CosmicType type;
    
    public BasePlanetaryBody(String name, Mass mass, HashMap<PeriodicElement, Double> elements, List<Population> populations,
            Integer techLevel, Integer tempKelvin, List<Satellite> satellites, List<CelestialRing> rings, Double volume,
            CosmicType type)
    {
        this.name = name;
        this.mass = mass;
        this.elements = elements;
        this.populations = populations;
        this.overallTechLevel = techLevel;
        this.tempKelvin = tempKelvin;
        this.satellites = satellites;
        this.rings = rings;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public Mass getMass()
    {
        return this.mass;
    }
}
