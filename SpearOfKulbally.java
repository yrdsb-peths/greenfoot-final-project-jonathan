import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * One of the Holy Relics
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class SpearOfKulbally extends Actor
{
    public static boolean hasSpear = false;
    public static boolean placedSpear = false;
    public static void resetStatic()
    {
        hasSpear = false;
        placedSpear = false;
    }
    public void act()
    {
        setImage("images/TheSpearOfKulbally.png");
        ItemBag world = (ItemBag) getWorld();
    }
}
