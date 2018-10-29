package com.lrg.model.character.d20;

public class Level<T extends CharacterClass>
{
    CharacterClass charClass;
    
    public Level(T charClass)
    {
        this.charClass = charClass; 
    }
    

}
