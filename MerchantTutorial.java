import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The merchant when he gives the tutorial
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class MerchantTutorial extends Actor
{
    public void act()
    {
        setImage("images/NPCs/Merchant.png");
        talk();
    }
    
    Text text20 = new Text(20);
    Text text21 = new Text(21);
    Text text22 = new Text(22);
    Text text23 = new Text(23);
    Text text24 = new Text(24);
    Text text25 = new Text(25);
    Text text26 = new Text(26);
    Text text27 = new Text(27);
    Text text28 = new Text(28);
    Text text29 = new Text(29);
    Text text30 = new Text(30);
    Text text31 = new Text(31);
    Text text32 = new Text(32);
    Text text33 = new Text(33);
    Text text34 = new Text(34);
    Text text35 = new Text(35);
    Text text36 = new Text(36);
    Text text37 = new Text(37);
    
    public void talk()
    {
        if(isTouching(MainCharacter.class) && Greenfoot.isKeyDown("f"))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text20, 600, 650);
        }
        if(Greenfoot.mouseClicked(text20))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text21, 600, 650);
        }
        if(Greenfoot.mouseClicked(text21))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text22, 600, 650);
        }
        if(Greenfoot.mouseClicked(text22))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text23, 600, 650);
        }
        if(Greenfoot.mouseClicked(text23))
        {
            World2Ver3 world = (World2Ver3)getWorld();
            world.addObject(text24, 600, 650);
        }
        if(Greenfoot.mouseClicked(text24))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text25, 600, 650);
        }
        if(Greenfoot.mouseClicked(text25))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text26, 600, 650);
        }
        if(Greenfoot.mouseClicked(text26))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text27, 600, 650);
        }
        if(Greenfoot.mouseClicked(text27))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text28, 600, 650);
        }
        if(Greenfoot.mouseClicked(text28))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text29, 600, 650);
        }
        if(Greenfoot.mouseClicked(text29))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text30, 600, 650);
        }
        if(Greenfoot.mouseClicked(text30))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text31, 600, 650);
        }
        if(Greenfoot.mouseClicked(text31))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text32, 600, 650);
        }
        if(Greenfoot.mouseClicked(text32))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text33, 600, 650);
        }
        if(Greenfoot.mouseClicked(text33))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text34, 600, 650);
        }
        if(Greenfoot.mouseClicked(text34))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text35, 600, 650);
        }
        if(Greenfoot.mouseClicked(text35))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text36, 600, 650);
            Potion.numberPotions += 5;
        }
        if(Greenfoot.mouseClicked(text36))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            world.addObject(text37, 600, 650);
        }
        if(Greenfoot.mouseClicked(text37))
        {
            World2Ver3 world = (World2Ver3) getWorld();
            Greenfoot.setWorld(new World2Ver4(getWorld()));
        }
    }
}
