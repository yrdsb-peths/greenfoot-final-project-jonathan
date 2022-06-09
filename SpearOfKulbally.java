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
        if(Greenfoot.mouseClicked(this))
        {
            Text text63 = new Text(63); 
            world.addObject(text63, 600, 400);
            UseKulballyButton useButton = new UseKulballyButton(getWorld());
            world.addObject(useButton, 400, 450);
            UseItemNoButton noButton = new UseItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
