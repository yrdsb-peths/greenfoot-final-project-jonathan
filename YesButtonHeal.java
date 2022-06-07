import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A yes button when NPC 2 asks if you want to heal
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class YesButtonHeal extends Actor
{
    public static boolean removeText = false;
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            World2Ver4 world = (World2Ver4) getWorld();
            MainCharacterFighting.mainCharacterHP = 100;
            removeText = true;
            
            
            
            
            
            
        }
        if(removeText)
        {
            World2Ver4 world = (World2Ver4) getWorld();
            world.removeObject(this);
        }
    }
}
