import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tutorial NPC 2 after the fight. 
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class TutorialNPC2Ver2 extends Actor
{
    public void act()
    {
        setImage("images/NPCs/FriendNPC2.png");
        talk();
    }
    
    Text text14 = new Text(14);
    Text text15 = new Text(15);
    Text text16 = new Text(16);
    Text text17 = new Text(17);
    Text text18 = new Text(18);
    
    public void talk()
    {
        World2Ver2 world = (World2Ver2) getWorld();
        world.addObject(text14, 600, 650);
        if(Greenfoot.mouseClicked(text14))
        {
            world.addObject(text15, 600, 650);
        }
        if(Greenfoot.mouseClicked(text15))
        {
            world.addObject(text16, 600, 650);
        }
        if(Greenfoot.mouseClicked(text16))
        {
            world.addObject(text17, 600, 650);
        }
        if(Greenfoot.mouseClicked(text17))
        {
            world.addObject(text18, 600, 650);
        }
        if(Greenfoot.mouseClicked(text18))
        {
            MainCharacterFighting.mainCharacterHP = 100;
            Greenfoot.setWorld(new World2Ver3());
        }
    }
}
