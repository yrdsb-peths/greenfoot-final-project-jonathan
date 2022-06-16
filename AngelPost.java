import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big red talks about his shop
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class AngelPost extends Actor
{
    public boolean alreadySaid = false; // Is true after first text is said
    Text text78 = new Text(78);
    Text text79 = new Text(79);
    public void act()
    {     
        setImage("images/NPCs/AngelFight/AngelFight000.png");
        if(alreadySaid == false)
        {
            FinalBattlePost world = (FinalBattlePost) getWorld();
            world.addObject(text78, 600, 650);
            alreadySaid = true;
        }
            
        if(Greenfoot.mouseClicked(text78))
        {
            FinalBattlePost world = (FinalBattlePost) getWorld();
            world.addObject(text79, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text79))
        {
            Greenfoot.setWorld(new EndScreen());
        }
    
    }
    
}
