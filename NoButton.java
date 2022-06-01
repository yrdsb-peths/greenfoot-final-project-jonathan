import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a No button for the first conversation
 * 
 * @author Jonathan Zhao 
 * @version May 31
 */
public class NoButton extends Actor
{
    /**
     * Act - do whatever the NoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static Text text2 = new Text(2);
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton2.png");
        }
        else
        {
            setImage("images/CharacterText/NoButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text2, 600, 650);
            Road road1 = new Road();
            world.addObject(road1, 800, 0);
            Wallet wallet = new Wallet();
            Wallet.walletLabel.setValue("$" + Wallet.wallet);
            world.addObject(Wallet.walletLabel, 40, 20);
        }
    }
}
