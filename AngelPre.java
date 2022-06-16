import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The angel before engaging in combat
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class AngelPre extends Actor
{
    public boolean alreadySaid = false; // Is true after first text is said
    Text text75 = new Text(75);
    Text text76 = new Text(76);
    Text text77 = new Text(77);
    public void act()
    {     
        setImage("images/NPCs/AngelFight/AngelFight000.png");
        if(alreadySaid == false)
        {
            PreFinalBattle world = (PreFinalBattle) getWorld();
            world.addObject(text75, 600, 650);
            alreadySaid = true;
        }
            
        if(Greenfoot.mouseClicked(text75))
        {
            PreFinalBattle world = (PreFinalBattle) getWorld();
            world.addObject(text76, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text76))
        {
            PreFinalBattle world = (PreFinalBattle) getWorld();
            world.addObject(text77, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text77))
        {
            Greenfoot.setWorld(new FinalBattle());
        }
    }
}
