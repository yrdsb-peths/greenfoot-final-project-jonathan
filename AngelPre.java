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
        if(alreadySaid == false)
        {
            FinalBattlePre world = (FinalBattlePre) getWorld();
            world.addObject(text75, 600, 650);
            alreadySaid = true;
        }
            
        if(Greenfoot.mouseClicked(text75))
        {
            FinalBattlePre world = (FinalBattlePre) getWorld();
            world.addObject(text76, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text76))
        {
            FinalBattlePre world = (FinalBattlePre) getWorld();
            world.addObject(text77, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text77))
        {
            Greenfoot.setWorld(new FinalBattle());
        }
        animateFight();
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[7];
    
    public AngelPre()
    {
        // Animation for idle
        for(int i = 0; i < 7; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/AngelFight/AngelFight00" + i + ".png");
        }
        setImage(fighting[0]);
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    
    public void animateFight()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(fighting[imageIndex]);
        imageIndex = (imageIndex + 1) % fighting.length; 
        
    }
}
