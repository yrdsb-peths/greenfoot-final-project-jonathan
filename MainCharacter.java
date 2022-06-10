import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Main Character's animations and movements in the normal world
 * 
 * @author Jonathan Zhao
 * @version 2
 */
public class MainCharacter extends Actor
{
    public static boolean canMove = true;  // Players can move unless speaking to someone
    
    public static void resetStatic()
    {
        canMove = true;
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] walk = new GreenfootImage[7];
    
    /**
     * Character Animations
     */
    public MainCharacter()
    {
        for(int i = 0; i < 7; i++)
        {
            walk[i] = new GreenfootImage("images/WalkCycle/Walk00" + i + ".png");
            walk[i].scale(50,70);
        }
    }
    
    int imageIndex = 0;
    public void animateWalkMainCharacter()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(walk[imageIndex]);
        imageIndex = (imageIndex + 1) % walk.length;
    }
    
    // Sprint animation
    public void animateSprintMainCharacter()
    {
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(walk[imageIndex]);
        imageIndex = (imageIndex + 1) % walk.length;
    }
    
    public void act()
    {
        
        
        // Sprint by holding shift
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("shift") && canMove)
        {
            setRotation(180);
            move(6);
            animateSprintMainCharacter();
        }
        else if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("shift") && canMove)
        {
            setRotation(0);
            move(6);
            animateSprintMainCharacter();
        }

        else if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("shift") && canMove)
        {
            setRotation(270);
            move(6);
            animateSprintMainCharacter();
        }
        else if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("shift") && canMove)
        {
            setRotation(90);
            move(6);
            animateSprintMainCharacter();
        }
        else if(Greenfoot.isKeyDown("a") && canMove)
        {
            setRotation(180);
            move(3);
            animateWalkMainCharacter();
        }
        else if(Greenfoot.isKeyDown("d") && canMove)
        {
            setRotation(0);
            move(3);
            animateWalkMainCharacter();
        }

        else if(Greenfoot.isKeyDown("w") && canMove)
        {
            setRotation(270);
            move(3);
            animateWalkMainCharacter();
        }
        else if(Greenfoot.isKeyDown("s") && canMove)
        {
            setRotation(90);
            move(3);
            animateWalkMainCharacter();
        }
        else
        {
            setImage("images/WalkCycle/MainIdle.png");
            
        }
    

        if(Greenfoot.isKeyDown("b"))
        {
            Greenfoot.setWorld(new ItemBag(getWorld()));
        }

    }
    

    


}
