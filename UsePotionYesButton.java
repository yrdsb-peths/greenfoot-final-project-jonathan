import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Confirms to use a potion
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class UsePotionYesButton extends Actor
{
    public static boolean usedPotion = false;
    
    World returnWorld;
    
    public UsePotionYesButton(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesPotion2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesPotion1.png");
        }
        Text text42 = new Text(42);
        if(Greenfoot.mouseClicked(this))
        {
            if(Potion.numberPotions <= 0)
            {
                
                ItemBag world = (ItemBag) getWorld();
                world.addObject(text42, 600, 400);
                ItemOKButton okButton = new ItemOKButton();
                world.addObject(okButton, 900, 450);
            }
            
            else
            {
                Potion.usePotion();
                usedPotion = true;
                Greenfoot.setWorld(returnWorld);
            }
        }
    }
}
