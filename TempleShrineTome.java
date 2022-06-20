import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrines of the temples
 * Holy Relics must be placed here for something to happen
 * 
 * @author Jonathan Zhao
 * @version June 7
 */
public class TempleShrineTome extends Actor
{
    public static boolean textSpawned = false;
    Text text80 = new Text(80);
    
    public static void resetStatic()
    {
        textSpawned = false;
        
    }
    public void act()
    {
        
        if(isTouching(MainCharacter.class) && !textSpawned && TomeOfRebaer.hasTome)
        {
            Temple world = (Temple) getWorld();
            Text text64 = new Text(64);
            world.addObject(text64, 600, 650);
            UseTomeButton useButton = new UseTomeButton();
            world.addObject(useButton, 400, 700);
            NoButtonRelicUse noButton = new NoButtonRelicUse();
            world.addObject(noButton, 890, 700);
            textSpawned = true;
            MainCharacter.canMove = false;
        }
        if(TomeOfRebaer.placedTome)
        {
            setImage("images/ShrineWithRebaer.png"); // shrine with tome on it
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
        if(GobletOfYabba.placedGoblet && SpearOfKulbally.placedSpear && TomeOfRebaer.placedTome && !TempleShrineSpear.textSpawned2)
        {
            Temple world = (Temple) getWorld();
            
            world.addObject(text80, 600, 650);
            TempleShrineSpear.textSpawned2 = true;
            
        }
        if(Greenfoot.mouseClicked(text80))
        {    
            Greenfoot.setWorld(new TempleCrumble());
        }
    }
}
