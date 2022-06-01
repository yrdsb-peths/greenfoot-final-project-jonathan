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
    Text text5 = new Text(5);
    Text text6 = new Text(6);
    Text text7 = new Text(7);
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
            Label instruction1 = new Label("Click the text box to continue conversations", 30);
            world.addObject(instruction1, 600, 500);
        }
        if(Greenfoot.mouseClicked(text3))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text4, 600, 650);
            
        }
        if(Greenfoot.mouseClicked(text4))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text5, 600, 650);
        }
        if(Greenfoot.mouseClicked(text5))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text6, 600, 650);
        }
        if(Greenfoot.mouseClicked(text6))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text7, 600, 650);
            Road road1 = new Road();
            world.addObject(road1, 800, 0);
        }
        
    }
}
