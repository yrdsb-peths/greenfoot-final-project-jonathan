import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The NPC teaching how to fight
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class TutorialNPC2Teaching extends Actor
{
    // Teaching text
    Text text12 = new Text(12);
    Text text13 = new Text(13);
    
    public void act()
    {
        talk();
    }
    
        public void talk()
    {
        World2BattleTeach world = (World2BattleTeach) getWorld();
        world.addObject(text12, 600, 400);
        if(Greenfoot.mouseClicked(text12))
        {
            world.addObject(text13, 600, 400);
        }
        if(Greenfoot.mouseClicked(text13))
        {
            Greenfoot.setWorld(new World2Battle());
        }
    }
}
