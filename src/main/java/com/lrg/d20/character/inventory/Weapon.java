package com.lrg.d20.character.inventory;

import com.lrg.base.model.BaseInteractableObject;
import com.lrg.base.model.Mass;
import com.lrg.base.model.MassiveBody;

public class Weapon extends BaseInteractableObject implements MassiveBody
{
    private Mass mass;
    private float range;
    private float maxRangeIncrements;

    @Override
    public Mass getMass()
    {
        return this.mass;
    }

    public float getRange()
    {
        return range;
    }
    
    public float getMaxRange()
    {
        return range * maxRangeIncrements;
    }
    
}
