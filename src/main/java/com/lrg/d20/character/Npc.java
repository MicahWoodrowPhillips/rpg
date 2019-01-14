package com.lrg.d20.character;

import com.lrg.d20.character.pathfinder.BasePFCharacter;
import com.lrg.d20.model.character.classes.BaseD20Character;
import com.lrg.d20.model.character.classes.FighterClassLevel;
import com.lrg.d20.rules.RuleSet;

public class Npc extends BasePFCharacter
{
    @Override
    public boolean isNpc() { return true;}

}
