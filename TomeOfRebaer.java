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
    public static boolean placedTome = false;
    public static void resetStatic()
    {
        hasTome = false;
        placedTome = false;
    }
    
    public void act()
    {
        setImage("images/TheTomeOfRebaer.png");
        ItemBag world = (ItemBag) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            Text text64 = new Text(64); 
            world.addObject(text64, 600, 400);
            UseRebaerButton useButton = new UseRebaerButton(getWorld());
            world.addObject(useButton, 400, 450);
            UseItemNoButton noButton = new UseItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
