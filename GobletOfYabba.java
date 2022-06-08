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
        if(Greenfoot.mouseClicked(this))
        {
            ItemBag world = (ItemBag) getWorld();
            Text text61 = new Text(61); 
            world.addObject(text61, 600, 400);
            UseYabbaButton useButton = new UseYabbaButton(getWorld());
            world.addObject(useButton, 400, 450);
            UseItemNoButton noButton = new UseItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
