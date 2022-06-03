import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a No button for the first conversation
 * 
 * @author Jonathan Zhao 
 * @version May 31
 */
public class NoButton extends Actor
{
    static Text text2 = new Text(2);
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text2, 600, 650);
            RoadToWorld2 road1 = new RoadToWorld2();
            world.addObject(road1, 800, 0);
            Wallet wallet = new Wallet();
            Wallet.walletLabel.setValue("$" + Wallet.wallet);
            world.addObject(Wallet.walletLabel, 100, 20);
        }
    }
}
