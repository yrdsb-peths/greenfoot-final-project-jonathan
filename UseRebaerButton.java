import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button that asks the player if they want to use the Tome of Rebaer
 * Only works when player stands on shrine to place the Tome
 * 
 * @author Jonathan Zhao    
 * @version June 8
 */
public class UseRebaerButton extends Actor
{
    World returnWorld;
    
    
    public UseRebaerButton(World returnWorld)
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
                TomeOfRebaer.placedTome = true;
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
