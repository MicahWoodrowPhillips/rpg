package com.lrg.d20.model.character.classes;

public class FighterClassLevel extends CharacterClassLevel
{
    public FighterClassLevel()
    {
        this(false);
    }
    
    public FighterClassLevel(boolean isNpc)
    {
        super(isNpc);
        this.setName("Fighter");
        this.setBabPerLevel(1);
        this.setFeatsProgression(FeatsProgression.FIGHTER);
    }

}
