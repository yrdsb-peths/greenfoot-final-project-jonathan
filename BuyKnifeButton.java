 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to buy throwing knife
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BuyKnifeButton extends Actor
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
            if(Wallet.wallet - 25 < 0)
            {
                RedShop world = (RedShop) getWorld();
                Text text47 = new Text(47);
                world.addObject(text47, 600, 400);
                BuyOkButtonRed okButton = new BuyOkButtonRed();
                world.addObject(okButton, 900, 450);
                
            }
            
            else
            {
                ThrowingKnife.numberKnives += 1;
                Wallet.wallet -= 25;
                Greenfoot.playSound("Purchase.wav");
            }
        }
    }
    
}
