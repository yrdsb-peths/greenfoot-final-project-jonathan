import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big red talks about his shop
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BigRedTalking extends Actor
{
    public boolean alreadySaid = false; // Is true after first text is said
    Text text67 = new Text(67);
    Text text68 = new Text(68);
    public void act()
    {     
        if(alreadySaid == false)
        {
            BigRedBattleAfter world = (BigRedBattleAfter) getWorld();
            world.addObject(text67, 600, 650);
            alreadySaid = true;
        }
            
        if(Greenfoot.mouseClicked(text67))
        {
            BigRedBattleAfter world = (BigRedBattleAfter) getWorld();
            world.addObject(text68, 600, 650);
        }
        
        if(Greenfoot.mouseClicked(text68))
        {
            Greenfoot.setWorld(new HeadquartersVer2(getWorld()));
        }
        animateFight();
    
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[11];
    public BigRedTalking()
    {
        // Animation for idle
        for(int i = 0; i < 11; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/BigRedFight/BigFight00" + i + ".png");
        }
        setImage(fighting[0]);
        
        animationTimer.mark();
    }
    
    public int imageIndex = 0;
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
