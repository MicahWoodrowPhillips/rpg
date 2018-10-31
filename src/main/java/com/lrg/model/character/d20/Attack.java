package com.lrg.model.character.d20;

import java.util.List;

public interface Attack
{
    public boolean isMelee();
    public List<DamageType> getDamageTypes();

}
