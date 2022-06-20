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
        animateFight();
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[7];
    
    public AngelPost()
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
