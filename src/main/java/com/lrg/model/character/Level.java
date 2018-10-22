package com.lrg.model.character;

public class Level<T extends CharacterClass>
{
    CharacterClass charClass;
    
    public Level(T charClass)
    {
        this.charClass = charClass; 
    }
    

}
