import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Holy Relic
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class TomeOfRebaer extends Actor
{
    public static boolean hasTome = false;
    public static void resetStatic()
    {
        hasTome = false;
    }
    
    public void act()
    {
        setImage("images/TheTomeOfRebaer.png");
    }
}
