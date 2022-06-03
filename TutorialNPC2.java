import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A second tutorial NPC
 * 
 * @author Jonathan Zhao 
 * @version June 1
 */
public class TutorialNPC2 extends Actor
{
    
    public void act()
    {
        setImage("images/NPCs/FriendNPC2.png");
        talk();    
    }
    
    Text text8 = new Text(8);
    Text text9 = new Text(9);
    Text text10 = new Text(10);
    Text text11 = new Text(11);
    
    public void talk()
    {
        if(isTouching(MainCharacter.class) && Greenfoot.isKeyDown("f"))
        {
            World2 world = (World2) getWorld();
            world.addObject(text8, 600, 650);
        }
        if(Greenfoot.mouseClicked(text8))
        {
            World2 world = (World2) getWorld();
            world.addObject(text9, 600, 650);
        }
        if(Greenfoot.mouseClicked(text9))
        {
            World2 world = (World2) getWorld();
            world.addObject(text10, 600, 650);
        }
        if(Greenfoot.mouseClicked(text10))
        {
            World2 world = (World2) getWorld();
            world.addObject(text11, 600, 650);

        }
        if(Greenfoot.mouseClicked(text11))
        {
            Greenfoot.setWorld(new World2BattleTeach());
        }
    }
}
