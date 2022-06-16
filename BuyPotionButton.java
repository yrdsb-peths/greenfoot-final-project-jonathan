 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to buy potion
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class BuyPotionButton extends Actor
{
    public void act()
    {
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
            if(Wallet.wallet - 5 < 0)
            {
                TheShop world = (TheShop) getWorld();
                Text text47 = new Text(47);
                world.addObject(text47, 600, 400);
                BuyOkButton okButton = new BuyOkButton();
                world.addObject(okButton, 900, 450);
            }
            
            else
            {
                Potion.numberPotions += 1;
                Wallet.wallet -= 5;
            }
        }
    }
    
}
