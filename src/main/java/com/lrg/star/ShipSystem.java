package com.lrg.star;

import java.util.List;

public interface ShipSystem extends HealthyPoweredObject
{
    public List<ShipSystem> getConnectedSystems();

}
