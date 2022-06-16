import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Throwing knife. Does 75 damage upon use.
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class ThrowingKnife extends Actor
{
    public static int numberKnives = 0;
    public static boolean useKnife = false;

    public static void resetStatic()
    {
        numberKnives = 0;
    }

    public void act()
    {
        setImage("images/ThrowingKnife.png");
        if(Greenfoot.mouseClicked(this))
        {
            ItemBag world = (ItemBag) getWorld();
            Text text73 = new Text(73); 
            world.addObject(text73, 600, 400);
            UseKnifeYesButton yesButton = new UseKnifeYesButton(getWorld());
            world.addObject(yesButton, 400, 450);
            UseItemNoButton noButton = new UseItemNoButton();
            world.addObject(noButton, 800, 450);
        }
        
    }
    
    public static void useKnife()
    {
        if(numberKnives > 0)
        {
            numberKnives -= 1;
            // Max HP is capped at 100
            if(TheRedsFighting.theReds)
            {
                TheRedsFighting.redHP -= 75;
                FightButton.punch = true;
            }
            else if(BigRedFighting.bigRed)
            {
                BigRedFighting.bigRedHP -= 75;
                FightButton.punch = true;
            }
            else if(AngelFighting.angel)
            {
                AngelFighting.angelHP -=75;
                FightButton.punch = true;
            }
        }
        
        
    }
}
