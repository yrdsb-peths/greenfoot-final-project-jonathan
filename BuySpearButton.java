import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to buy The Spear of Kulbally
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class BuySpearButton extends Actor
{
    private boolean bought = false;
    Text text48 = new Text(48);
    Text text49 = new Text(49);
    Text text53 = new Text(53);
    Text text51 = new Text(51);
    Text text52 = new Text(52);
    Text text55 = new Text(55);
    Text text56 = new Text(56);
    
    public void act()
    {
        TheShop world = (TheShop) getWorld();
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Buy2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Buy1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            if(Wallet.wallet - 100 > 0) // sufficient currency
            {
                SpearOfKulbally.hasSpear = true;
                Wallet.wallet -= 100;
                TheShop.relicsBought++;
                bought = true;
            }
            else
            {
                Text text47 = new Text(47);
                world.addObject(text47, 600, 400);
                BuyOkButton okButton = new BuyOkButton();
                world.addObject(okButton, 900, 450);   
            }       
        }
        if(bought)
        {
            if(TheShop.relicsBought == 1)
            {
                world.addObject(text48, 600, 400);
            }
            else 
            {
                world.addObject(text53, 600, 400);
            }
            
            if(Greenfoot.mouseClicked(text48))
            {
                world.addObject(text49, 600, 400);
            }
            if(Greenfoot.mouseClicked(text49))
            {
                world.addObject(text53, 600, 400);
            }
            if(Greenfoot.mouseClicked(text53))
            {
                world.addObject(text51, 600, 400);
            }
            if(Greenfoot.mouseClicked(text51))
            {
                world.addObject(text52, 600, 400);
            }
            if(Greenfoot.mouseClicked(text52))
            {
                Greenfoot.setWorld(new TheShop(getWorld()));
            }
            if(Greenfoot.mouseClicked(text51) && TheShop.relicsBought == 3)
            {
                world.addObject(text55, 600, 400);
            }
            if(Greenfoot.mouseClicked(text55))
            {
                world.addObject(text56, 600, 400);
            }
            if(Greenfoot.mouseClicked(text56))
            {
                Greenfoot.setWorld(new TheShop(getWorld()));
            }
        }
    }
}
