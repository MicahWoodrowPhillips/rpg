package com.lrg.model.character.d20;

import java.util.List;

public class Skill
{
    private String name;
    private String description;
    private Modifier totalMod;
    private int ranks;
    private boolean classSkill;
    private List<Skill> synergy;
    private List<SkillTricks> tricks;
    private List<CircumstantialModifier> circumstantialModifiers;
    private int abilityMod;
    private Attribute ability;
    
    
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public Modifier getTotalMod()
    {
        recheckAllFactors();
        return totalMod;
    }
    public void setTotalMod(Modifier totalMod)
    {
        this.totalMod = totalMod;
    }
    public int getRanks()
    {
        return ranks;
    }
    public void setRanks(int ranks)
    {
        this.ranks = ranks;
    }
    public boolean isClassSkill()
    {
        return classSkill;
    }
    public void setClassSkill(boolean classSkill)
    {
        this.classSkill = classSkill;
    }
    public List<Skill> getSynergy()
    {
        return synergy;
    }
    public void setSynergy(List<Skill> synergy)
    {
        this.synergy = synergy;
    }
    public List<SkillTricks> getTricks()
    {
        return tricks;
    }
    public void setTricks(List<SkillTricks> tricks)
    {
        this.tricks = tricks;
    }
    public List<CircumstantialModifier> getCircumstantialModifiers()
    {
        return circumstantialModifiers;
    }
    public void setCircumstantialModifiers(List<CircumstantialModifier> circumstantialModifiers)
    {
        this.circumstantialModifiers = circumstantialModifiers;
    }
    public int getAbilityMod()
    {
        return abilityMod;
    }
    public void setAbilityMod(int abilityMod)
    {
        this.abilityMod = abilityMod;
    }
    public Attribute getAbility()
    {
        return ability;
    }
    public void setAbility(Attribute ability)
    {
        this.ability = ability;
    }


    private void recheckAllFactors()
    {
        int total = 0;
        total += ranks;
        total += classSkill ? 3 : 0;
//        total = circumstantialModifiers.stream().doShit();
        total += ability.getModifier();
        
        
    }
}