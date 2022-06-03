import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main character throws a punch in combat against the tutorial character
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class FightButtonTutorial extends Actor
{
    Label tutorialHPLabel = new Label(TutorialNPC2Fighting.tutorialHP, 50);
    World2Battle world = (World2Battle) getWorld();
    
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
            TutorialNPC2Fighting.tutorialHP -= Greenfoot.getRandomNumber(21);
            punch = true;
        }
    }
}
