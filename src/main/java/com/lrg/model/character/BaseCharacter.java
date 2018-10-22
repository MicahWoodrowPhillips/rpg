package com.lrg.model.character;

import java.util.List;

import com.lrg.star.model.Energy;
import com.lrg.star.model.Health;
import com.lrg.star.model.Mass;

public class BaseCharacter
{
    Health health;
    Energy energy;
    Mass mass;

    Attribute strength;
    Attribute dexterity;
    Attribute constitution;
    Attribute intelligence;
    Attribute wisdom;
    Attribute charisma;
    private List<CharacterClass> levels;

    public BaseCharacter(Attribute strength, Attribute dexterity, Attribute constitution,
            Attribute intelligence, Attribute wisdom, Attribute charisma, List<CharacterClass> classLevels)
    {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.levels = classLevels;
    }
    
    
}
