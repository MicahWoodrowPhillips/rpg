package com.lrg.d20.model.character.classes;

public abstract class CharacterClassLevel
{
    private String name;
    private float bab = 0.5f;
    private int levels;
    private FeatsProgression featsProgression = FeatsProgression.NORMAL;
    protected boolean isNpc = false;

    public CharacterClassLevel(boolean isNpc)
    {
        this.isNpc = isNpc;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    protected void setBabPerLevel(float bab)
    {
        this.bab = bab;
    }

    protected int getBabFromAllLevels()
    {
        return (int) (levels * bab);
    }

    protected int getLevelValue()
    {
        return levels;
    }

    public void levelUp()
    {
        levels++;
        // TODO 
        if (/*getsFeat()*/true)
        {
            if (isNpc)
            {
                //                TODO 
                //                lookupNpcFeat(this.getClass());
            }

            //            TODO 
            // Dialog for picking a feat
        }
    }

    protected void setFeatsProgression(FeatsProgression progression)
    {
        this.featsProgression = progression;
    }

}
