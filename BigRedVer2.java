import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big red after the fight. Acts as a weapon shop
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BigRedVer2 extends Actor
{
    public boolean firstTextSpawned = false;
    
    public void act()
    {
        talk();
        setImage("images/NPCs/BigRed.png");
    }
    
    
    Text text69 = new Text(69);
    
    public void talk()
    {
        if(isTouching(MainCharacter.class) && firstTextSpawned == false && Greenfoot.isKeyDown("f"))
        {
            HeadquartersVer2 world = (HeadquartersVer2) getWorld();
            world.addObject(text69, 600, 650);
            firstTextSpawned = true;
            MainCharacter.canMove = false;
            RedBuyButton buyButton = new RedBuyButton();
            RedByeButton byeButton = new RedByeButton();
            world.addObject(buyButton, 550, 700);
            world.addObject(byeButton, 850, 700);
            MainCharacter.canMove = false;
        }
        
    }
}
