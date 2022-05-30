import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacter extends Actor
{
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(3);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(3);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(3);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(3);
        }
    }
}
