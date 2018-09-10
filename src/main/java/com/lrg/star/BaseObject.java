package com.lrg.star;

public interface BaseObject
{
    /**
     * Returns the name of this object.
     * 
     * @return
     */
    public String getName();
    public void setName(String name);

    /**
     * Triggers the "heartbeat" functions available to this object. Ideally, most (all?) objects in the game will have some kind of
     * heartbeat functionality to maintain their own state if necessary, or this will be a noop if no state is required.
     */
    public void heartbeat();

    /**
     * A simple "toString()" of sorts, that is user-facing and can be tied to tooltips, etc.
     * @return
     */
    public String getDescription();
}
