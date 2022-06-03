import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The tutorial NPC from after the fight onwards.
 * He acts like a healing station
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class TutorialNPC2Ver3 extends Actor
{
    public void act()
    {
        setImage("images/NPCs/FriendNPC2.png");
        heal();  
    }
    
    Text text19 = new Text(19);
    public void heal()
    {
        if(isTouching(MainCharacter.class) && Greenfoot.isKeyDown("f"))
            {
                World2Ver4 world = (World2Ver4) getWorld();
                world.addObject(text19, 600, 650);
                YesButtonHeal yesButtonHeal = new YesButtonHeal();
                NoButtonHeal noButtonHeal = new NoButtonHeal();
                world.addObject(yesButtonHeal, 760, 700);
                world.addObject(noButtonHeal, 890, 700);
            }    
    }
}
