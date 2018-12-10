package com.lrg.d20.combat;

import java.util.List;

public interface Attack
{
    public boolean isMelee();
    public List<DamageType> getDamageTypes();

}
