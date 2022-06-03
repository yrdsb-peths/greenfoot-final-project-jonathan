import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A yes button when NPC 2 asks if you want to heal
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class YesButtonHeal extends Actor
{
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
            MainCharacterFighting.mainCharacterHP = 100;
            Greenfoot.setWorld(new World2Ver4(getWorld()));
        }
    }
}
