import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrines of the temples
 * Holy Relics must be placed here for something to happen
 * 
 * @author Jonathan Zhao
 * @version June 7
 */
public class TempleShrineSpear extends Actor
{
    public static boolean textSpawned = false;
    public static boolean textSpawned2 = false;
    Text text80 = new Text(80);
    
    public static void resetStatic()
    {
        textSpawned = false;
        textSpawned2 = false;
    }
    public void act()
    {
        
        if(isTouching(MainCharacter.class) && !textSpawned && SpearOfKulbally.hasSpear)
        {
            Temple world = (Temple) getWorld();
            Text text63 = new Text(63);
            world.addObject(text63, 600, 650);
            UseSpearButton useButton = new UseSpearButton();
            world.addObject(useButton, 400, 700);
            NoButtonRelicUse noButton = new NoButtonRelicUse();
            world.addObject(noButton, 890, 700);
            textSpawned = true;
            MainCharacter.canMove = false;
        }
        if(SpearOfKulbally.placedSpear)
        {
            setImage("images/ShrineWithKulbally.png"); // shrine with spear on it
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
        if(GobletOfYabba.placedGoblet && SpearOfKulbally.placedSpear && TomeOfRebaer.placedTome && !textSpawned2)
        {
            Temple world = (Temple) getWorld();
            
            world.addObject(text80, 600, 650);
            textSpawned2 = true;
        }
        if(Greenfoot.mouseClicked(text80))
        {    
            Greenfoot.setWorld(new TempleCrumble());
        }
    }
}
