package com.lrg.d20.model.character.classes;

public class Level<T extends CharacterClass>
{
    CharacterClass charClass;
    
    public Level(T charClass)
    {
        this.charClass = charClass; 
    }
    

}
