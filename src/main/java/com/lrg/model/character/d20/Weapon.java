package com.lrg.model.character.d20;

import com.lrg.star.model.BaseInteractableObject;
import com.lrg.star.model.Mass;
import com.lrg.star.model.MassiveBody;

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
