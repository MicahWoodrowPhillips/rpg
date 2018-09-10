package com.lrg.star.model;

public class Inertia extends BaseObjectImpl
{
    /**
     * Position values in world space.
     */
    private float x, y, z;
    
    /**
     * Direction values in local space;
     */
    private float xD, yD, zD;

    /**
     * Creates an inertia object at the given (x,y,z) with 0 inertia.
     * 
     * @param x
     * @param y
     * @param z
     */
    public Inertia(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        xD = yD = zD = 0;
    }
    
    public static Inertia noneInertia()
    {
        return new Inertia(0,0,0);
    }

    public void setName(String name)
    {
        // no op
    }

    private void updatePosition()
    {
        x = x + xD;
        y = y + yD;
        z = z + zD;
    }
    
    @Override
    public String getName()
    {
        return "Inertia of " + parentName;
    }
    
    /**
     *  Puts object into a particular position, does not change its direction or speed of travel.
     * @param x of new location
     * @param y of new location
     * @param z of new location
     */
    public void teleport(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void instantStop()
    {
        xD = yD = zD = 0;
    }

    public void halfSpeed()
    {
        xD /= 2;
        yD /= 2;
        zD /= 2;
    }

    @Override
    public void heartbeat()
    {
        updatePosition();
    }
    
}
