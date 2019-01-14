package com.lrg.d20.model.character.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lrg.base.model.Energy;
import com.lrg.base.model.Health;
import com.lrg.base.model.Interactable;
import com.lrg.base.model.Mass;
import com.lrg.d20.character.inventory.BodySlot;
import com.lrg.d20.character.inventory.Equipment;
import com.lrg.d20.character.inventory.Weapon;
import com.lrg.d20.character.skill.Skill;
import com.lrg.d20.combat.Attack;
import com.lrg.d20.combat.MeleeAttack;
import com.lrg.d20.model.character.attribute.Attribute;
import com.lrg.d20.model.character.attribute.Charisma;
import com.lrg.d20.model.character.attribute.Constitution;
import com.lrg.d20.model.character.attribute.Dexterity;
import com.lrg.d20.model.character.attribute.Intelligence;
import com.lrg.d20.model.character.attribute.Strength;
import com.lrg.d20.model.character.attribute.Wisdom;
import com.lrg.d20.rules.RuleSet;

public abstract class BaseD20Character
{
    protected RuleSet ruleSet;
    
    private Health health;
    private Energy energy;
    private Mass mass;
    
    private TextAttributes textAttributes;

    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private Wisdom wisdom;
    private Charisma charisma;
    
    private List<Skill> skills;
    
    private Map<BodySlot, Equipment> equipment;
    private List<CharacterClassLevel> classLevels;
    
    private String description;

    // Abstract methods
    public abstract RuleSet getRuleSet();
    
    public BaseD20Character()
    {
        this.strength = new Strength();
        this.dexterity = new Dexterity();
        this.constitution = new Constitution();
        this.intelligence = new Intelligence();
        this.wisdom = new Wisdom();
        this.charisma = new Charisma();
        this.classLevels = new ArrayList<CharacterClassLevel>();
    }

    public BaseD20Character(Attribute strength, Attribute dexterity, Attribute constitution,
            Attribute intelligence, Attribute wisdom, Attribute charisma, List<CharacterClassLevel> classLevels)
    {
        this.strength = (Strength) strength;
        this.dexterity = (Dexterity) dexterity;
        this.constitution = (Constitution) constitution;
        this.intelligence = (Intelligence) intelligence;
        this.wisdom = (Wisdom) wisdom;
        this.charisma = (Charisma) charisma;
        this.classLevels = new ArrayList<CharacterClassLevel>(classLevels);
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

    public Health getHealth()
    {
        return health;
    }

    public Energy getEnergy()
    {
        return energy;
    }

    public Mass getMass()
    {
        return mass;
    }

    public TextAttributes getTextAttributes()
    {
        return textAttributes;
    }

    public Strength getStrength()
    {
        return strength;
    }

    public Dexterity getDexterity()
    {
        return dexterity;
    }

    public Constitution getConstitution()
    {
        return constitution;
    }

    public Intelligence getIntelligence()
    {
        return intelligence;
    }

    public Wisdom getWisdom()
    {
        return wisdom;
    }

    public Charisma getCharisma()
    {
        return charisma;
    }

    public List<Skill> getSkills()
    {
        return skills;
    }

    public Map<BodySlot, Equipment> getEquipment()
    {
        return equipment;
    }

    public List<CharacterClassLevel> getCharacterClassLevels()
    {
        return classLevels;
    }
    
    public String getCharacterClassesAndLevelsAsCSVString()
    {

        StringBuffer sb = new StringBuffer();
        for (CharacterClassLevel clz : this.getCharacterClassLevels())
        {
            sb.append(clz.getName());
            sb.append(" (");
            sb.append(clz.getLevelValue());
            sb.append("), ");
        }
        
        // Remove the final ", " from the end
        sb.replace(sb.length()-3, sb.length()-1, "");
        
        return sb.toString();
    }
    
    protected int getRangedAttackValue()
    {
        return 0;
    }

    protected int getMeleeAttackValue()
    {
        return 0;
    }
    
    protected int getBAB()
    {
        return 0;
    }
    
    protected String getDescription()
    {
        return description;
    }

    public boolean isNpc()
    {
        return false;
    }
}
