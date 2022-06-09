import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button that asks the player if they want to use the Spear of Kulbally
 * Only works when player stands on shrine to place the Spear
 * @author Jonathan Zhao
 * @version June 8
 */
public class UseKulballyButton extends Actor
{
    World returnWorld;
    
    
    public UseKulballyButton(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Use2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Use1.png");
        }
        Text text62 = new Text(62);
        if(Greenfoot.mouseClicked(this))
        {
            if(TempleShrine.touchingShrine)
            {
                SpearOfKulbally.placedSpear = true;
                Greenfoot.setWorld(returnWorld);
            }
            
            else
            {   
                ItemBag world = (ItemBag) getWorld();
                world.addObject(text62, 600, 400);
                ItemOKButton okButton = new ItemOKButton();
                world.addObject(okButton, 900, 450);
            }
        }
    }
}
