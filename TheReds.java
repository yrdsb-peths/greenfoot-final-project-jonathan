import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Reds in their overworld form.
 * 
 * @author Jonathan Zhao
 * @version June 6
 */
public class TheReds extends Actor
{
    public static boolean canMove = true; // Can't move if speaking to main character
    
    public static void resetStatic()
    {
        canMove = true;
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] walk = new GreenfootImage[7];
    public int getRandomNumber(int start, int end) // Gets random number between two numbers
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal + start;
    }
    
    // Animations
    public TheReds()
    {
        for(int i = 0; i < 7; i++)
        {
            walk[i] = new GreenfootImage("images/WalkCycle/RedWalk00" + i + ".png");
            walk[i].scale(50,70);
        }
    }
    
    int imageIndex = 0;
    public void animateWalkRed()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(walk[imageIndex]);
        imageIndex = (imageIndex + 1) % walk.length;
    }
    
    public boolean firstTextSpawned = false;
    public void act()
    {
        talk();
        if(canMove)
        {
            animateWalkRed();
            move(2);
        }
        else
        {
            setImage("images/WalkCycle/RedIdle.png");
        }
        
        if(isAtEdge())
        {
            turn(180);
        }
        
    }
    
    Text text58 = new Text(58);
    Text text59 = new Text(59);
    Text text60 = new Text(60);
    public int randomText = getRandomNumber(1, 4);
    public void talk()
    {
        firstTextSpawned = false;
        if(isTouching(MainCharacter.class) && firstTextSpawned == false && randomText == 1)
        {
            Stronghold world = (Stronghold) getWorld();
            world.addObject(text58, 600, 650);
            firstTextSpawned = true;
            MainCharacter.canMove = false;
            canMove = false;
        }
        if(isTouching(MainCharacter.class) && firstTextSpawned == false && randomText == 2)
        {
            Stronghold world = (Stronghold) getWorld();
            world.addObject(text59, 600, 650);
            firstTextSpawned = true;
            MainCharacter.canMove = false;
            canMove = false;
        }
        if(isTouching(MainCharacter.class) && firstTextSpawned == false && randomText == 3)
        {
            Stronghold world = (Stronghold) getWorld();
            world.addObject(text60, 600, 650);
            firstTextSpawned = true;
            MainCharacter.canMove = false;
            canMove = false;
        }
        if(Greenfoot.mouseClicked(text58))
        {
            Greenfoot.setWorld(new StrongholdBattle());
        }
        else if(Greenfoot.mouseClicked(text59))
        {
            Greenfoot.setWorld(new StrongholdBattle());
        }
        else if(Greenfoot.mouseClicked(text60))
        {
            Greenfoot.setWorld(new StrongholdBattle());
        }
    }
}
