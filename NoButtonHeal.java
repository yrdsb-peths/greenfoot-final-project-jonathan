import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A no button for when NPC 2 asks if you want to heal
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class NoButtonHeal extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            World2Ver4 world = (World2Ver4) getWorld();
            world.removeObject(this);
            YesButtonHeal.removeText = true;
        }
        
    }
    
}
