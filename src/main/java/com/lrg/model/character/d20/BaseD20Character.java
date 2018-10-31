package com.lrg.model.character.d20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lrg.star.Interactable;
import com.lrg.star.model.Energy;
import com.lrg.star.model.Health;
import com.lrg.star.model.Mass;

public class BaseD20Character
{
    protected RuleSet ruleSet;
    
    protected Health health;
    protected Energy energy;
    protected Mass mass;

    protected Strength strength;
    protected Dexterity dexterity;
    protected Constitution constitution;
    protected Intelligence intelligence;
    protected Wisdom wisdom;
    protected Charisma charisma;
    
    protected List<Skill> skills;
    
    protected Map<Slot, Equipment> equipment;
    
    /**
     * Order will matter for the levels at some point possibly, so we should keep them in some kind of ordered list.
     */
    private List<CharacterClass> levels;
    
    public BaseD20Character()
    {
        this.strength = new Strength();
        this.dexterity = new Dexterity();
        this.constitution = new Constitution();
        this.intelligence = new Intelligence();
        this.wisdom = new Wisdom();
        this.charisma = new Charisma();
        this.levels = new ArrayList<CharacterClass>();
    }

    public BaseD20Character(Attribute strength, Attribute dexterity, Attribute constitution,
            Attribute intelligence, Attribute wisdom, Attribute charisma, List<CharacterClass> classLevels)
    {
        this.strength = (Strength) strength;
        this.dexterity = (Dexterity) dexterity;
        this.constitution = (Constitution) constitution;
        this.intelligence = (Intelligence) intelligence;
        this.wisdom = (Wisdom) wisdom;
        this.charisma = (Charisma) charisma;
        this.levels = new ArrayList<CharacterClass>(classLevels);
    }
    
    public Attack getMeleeWeaponAttack(Interactable target, Weapon weapon)
    {
        Attack melee = new MeleeAttack(target, weapon);
                
        return melee;
    }
    
    public Attack getRangedWeaponAttack(Interactable target, Weapon weapon)
    {
        Attack ranged = null;
        
        return ranged;
        
    }
}
