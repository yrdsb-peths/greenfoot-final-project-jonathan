import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character from the stronghold back to World2Ver4
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class RoadStrongholdToWorld2Ver4 extends Actor
{
    World returnWorld;
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(returnWorld);
        }
    }
    
    public RoadStrongholdToWorld2Ver4(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
}
