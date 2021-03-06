package com.lrg.d20.character.pathfinder;

import com.lrg.d20.model.character.classes.BaseD20Character;
import com.lrg.d20.model.character.classes.CharacterClassLevel;
import com.lrg.d20.rules.RuleSet;

public class BasePFCharacter extends BaseD20Character
{
    @Override
    public RuleSet getRuleSet()
    {
        if (ruleSet == null)
        {
            ruleSet = new PathfinderRuleSet();
        }
        return this.ruleSet;
    }

    @Override
    public String getDescription()
    {
        StringBuilder sb = new StringBuilder();
        
        // Name
        sb.append("Name: ");
        sb.append(this.getTextAttributes().getFirstName());
        sb.append(' ');
        sb.append(this.getTextAttributes().getLastName());
        sb.append('\n');
        // sb.append(',');
        // sb.append(titlesGained());
        
        // Classes
        sb.append('\n');
        sb.append("Classes: ");
        sb.append(this.getCharacterClassesAndLevelsAsCSVString());
        sb.append('\n');
               
        
        
        // BAB, Melee, Ranged, CMD
        sb.append('\n');
        sb.append("BAB: ");
        sb.append(this.getBAB());
        sb.append(", MELEE: ");
        sb.append(this.getMeleeAttackValue());
        sb.append(", RANGED: " );
        sb.append(this.getRangedAttackValue());
        sb.append(", CMD: ");
        sb.append(this.getCMD());
        sb.append('\n');
        
        // AC, FF, TOUCH, 
        
        // Saves
        sb.append('\n');
        sb.append('\n');
        
        // Attributes(Fully updated modifiers)
        sb.append('\n');
        sb.append('\n');
        
        // Physical Description
        sb.append('\n');
        sb.append('\n');
        
        
        
        return sb.toString();
    }


    private int getCMD()
    {
        return 0;
    }
    
    /**
     * levelUp - does a lookup for the passed-in class.  If it exists, adds to its existing capabilities on the character involved.<br />
     * If not, adds it to the character's class list.  Does NOT handle multiclass penalties, should do so in a Ruleset somehow?<br />
     * <br />
     * This method creates a bounded type parameter in order to grab a class from CharacterClassLevel specifically.<br />
     * 
     * @param characterClass
     */
    public <charClass extends CharacterClassLevel> void levelUp(charClass characterClass)
    {
        for(CharacterClassLevel clazz : this.getCharacterClassLevels())
        {
            if (clazz.getClass().equals(characterClass))
            {
                clazz.levelUp();
                break;
            }
        }
        
    }

}