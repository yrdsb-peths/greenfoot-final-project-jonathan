import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Confirms to use a throwing knife
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class UseKnifeYesButton extends Actor
{
    public static boolean usedPotion = false;
    
    World returnWorld;
    
    public UseKnifeYesButton(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesKnife2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesPotion1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            
            if(ThrowingKnife.numberKnives <= 0)
            {
                Text text71 = new Text(71);
                ItemBag world = (ItemBag) getWorld();
                world.addObject(text71, 600, 400);
                ItemOKButton okButton = new ItemOKButton();
                world.addObject(okButton, 900, 450);
            }
            else
            {
                if(!TheRedsFighting.theReds || !BigRedFighting.bigRed)
                {
                    Text text72 = new Text(72);
                    ItemBag world = (ItemBag) getWorld();
                    world.addObject(text72, 600, 400);
                }
                else
                {
                    ThrowingKnife.useKnife();    
                }
            }
        }
    }
}
