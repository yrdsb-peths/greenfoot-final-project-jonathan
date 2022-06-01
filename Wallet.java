import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A wallet that stores money
 * 
 * @author Jonathan Zhao 
 * @version June 1
 */
public class Wallet extends Actor
{
    public static int wallet = 0;
    static Label walletLabel;
    
    public Wallet()
    {
        walletLabel = new Label(0,45);
        
    }
    
    public static void resetStatic()
    {
        wallet = 0;
    }
    
    public void act()
    {
        
    }
    
    public static void lootMoney()
    {
        wallet += Greenfoot.getRandomNumber(21);
        walletLabel.setValue("$" + wallet);
        
    }
}
