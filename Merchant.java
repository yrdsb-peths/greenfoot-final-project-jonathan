import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Merchant who sells wares
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class Merchant extends Actor
{
    public void act()
    {
        setImage("images/NPCs/Merchant.png");
        talk();
    }
    
    Text text39 = new Text(39);
    
    public void talk()
    {
        if(isTouching(MainCharacter.class) && Greenfoot.isKeyDown("f"))
        {
            World2Ver4 world = (World2Ver4) getWorld();
            world.addObject(text39, 600, 650);
            BuyButton buyButton = new BuyButton();
            ByeButton byeButton = new ByeButton();
            world.addObject(buyButton, 550, 700);
            world.addObject(byeButton, 850, 700);
        }
    }
}
