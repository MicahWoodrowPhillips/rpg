package com.lrg.model.character.d20;

/**
 * Includes all circumstantial modifiers to anything (especially skills and combat rolls). <br />
 * Can include (but is not limited to):<p>
 * <ul>
 *  <li>Morale Bonuses </li>
 *  <li>Flanking Bonus </li>
 *  <li>Circumstance Bonuses </li>
 *  <li>Even stackable things like Dodge Bonuses </li>
 *  <li>Other temporary things</li>
 * </ul>
 * @author wphillips
 *
 */
public class CircumstantialModifier extends Modifier
{
    public CircumstantialModifier(Influential influentialObject)
    {
        super(influentialObject);
    }

    private Circumstance circumstance;

    public Circumstance getCircumstance()
    {
        return circumstance;
    }

    public void setCircumstance(Circumstance circumstance)
    {
        this.circumstance = circumstance;
    }

}
