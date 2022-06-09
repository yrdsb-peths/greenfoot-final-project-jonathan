import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * One of the Holy Relics.
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class GobletOfYabba extends Actor
{
    public static boolean hasGoblet = false;
    public static boolean placedGoblet = false;
    public static void resetStatic()
    {
        hasGoblet = false;
        placedGoblet = false;
    }
    
    
    public void act()
    {
        setImage("images/TheGobletOfYabba.png");
        ItemBag world = (ItemBag) getWorld();
    }
}
