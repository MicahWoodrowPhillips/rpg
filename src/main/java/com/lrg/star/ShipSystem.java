package com.lrg.star;

import java.util.List;

import com.lrg.base.model.HealthyPoweredObject;

public interface ShipSystem extends HealthyPoweredObject
{
    public List<ShipSystem> getConnectedSystems();

}
