package com.lrg.model.character.d20;

import java.util.ArrayList;
import java.util.List;

import com.lrg.star.Interactable;

public class MeleeAttack implements Attack
{

    private Interactable target;
    private Weapon weapon;
    private List<DamageType> damageTypes;

    public MeleeAttack(Interactable target, Weapon weapon)
    {
        this.target = target;
        this.weapon = weapon;
    }
    
    public float getRange()
    {
        return weapon.getRange();
    }

    @Override
    public boolean isMelee()
    {
        return true;
    }

    @Override
    public List<DamageType> getDamageTypes()
    {
        if (damageTypes == null)
        {
            damageTypes = new ArrayList<DamageType>();
            damageTypes.add(DamageType.MELEE);
        }
        
        return damageTypes;
    }
    
}
