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
        return new BasePlanetaryBody(name, mass, elements, populations, techLevel, tempKelvin, satellites, rings, volume, type);
    }

}
