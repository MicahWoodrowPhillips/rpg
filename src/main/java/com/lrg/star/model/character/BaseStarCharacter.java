package com.lrg.star.model.character;

import java.util.List;

import com.lrg.model.character.Attribute;
import com.lrg.model.character.BaseCharacter;
import com.lrg.model.character.CharacterClass;

public class BaseStarCharacter extends BaseCharacter
{

    public BaseStarCharacter(Attribute strength, Attribute dexterity, Attribute constitution, Attribute intelligence,
            Attribute wisdom, Attribute charismam, List<CharacterClass> levels)
    {
        super(strength, dexterity, constitution, intelligence, wisdom, charismam, levels);
    }

}
