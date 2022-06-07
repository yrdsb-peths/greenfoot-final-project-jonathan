import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main character throws a punch in combat
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class FightButton extends Actor
{
    Label redHPLabel = new Label(TheRedsFighting.redHP, 50);
    StrongholdBattle world = (StrongholdBattle) getWorld();
    
    public static boolean punch = false;
    public static boolean enemyTurn = false;
    public static boolean enemyTurnAnimations = false;
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/PunchButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/PunchButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            TheRedsFighting.redHP -= Greenfoot.getRandomNumber(21);
            punch = true;
        }
    }
}
