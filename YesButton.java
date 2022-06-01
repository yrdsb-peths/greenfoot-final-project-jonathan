import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A clickable yes button 
 * 
 * @author Jonathan Zhao 
 * @May 31
 */
public class YesButton extends Actor
{
    Text text3 = new Text(3);
    Text text4 = new Text(4);
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesButton2.png");
        }
        else
        {
            setImage("images/CharacterText/YesButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text3, 600, 650);
            
        }
        if(Greenfoot.mouseClicked(text3))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text4, 600, 650);
            
        }
        
        
        
    }
    
    
}
