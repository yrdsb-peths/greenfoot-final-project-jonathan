import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Methods for starting and stopping soundtracks
 * 
 * @author Jonathan Zhao
 * @version June 19th
 */
public class Soundtrack extends Actor
{
    public static GreenfootSound bossMusicPre = new GreenfootSound("sounds/BossBattleMusicPre.wav");
    public static GreenfootSound bossMusic = new GreenfootSound("sounds/BossBattleMusic.wav");
    public static GreenfootSound fightingMusic = new GreenfootSound("sounds/FightingMusic.wav");
    public static GreenfootSound firstWorldMusic = new GreenfootSound("sounds/FirstWorldMusic.wav");
    public static GreenfootSound secondWorldMusic = new GreenfootSound("sounds/SecondWorldMusic.wav");
    public static GreenfootSound deathMusic = new GreenfootSound("sounds/DeathMusic.wav");
    public static GreenfootSound victoryMusic = new GreenfootSound("sounds/VictoryMusic.wav");
    public static GreenfootSound templeMusic = new GreenfootSound("sounds/TempleMusic.wav");
    
    /**
     * Set volumes
     */
    public static void setVolume()
    {
        bossMusicPre.setVolume(60);
        bossMusic.setVolume(30);
        fightingMusic.setVolume(30);
        firstWorldMusic.setVolume(20);
        secondWorldMusic.setVolume(15);
        deathMusic.setVolume(60);
        victoryMusic.setVolume(50);
        templeMusic.setVolume(45);
    }
    
    /**
     * Stops music
     */
    public static void stopAll()
    {
        fightingMusic.stop();
        firstWorldMusic.stop();
        deathMusic.stop();
        victoryMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
        bossMusic.stop();
    }
    
    /**
     * Stops music except boss music
     */
    public static void stopAllExceptBoss()
    {
        fightingMusic.stop();
        firstWorldMusic.stop();
        deathMusic.stop();
        victoryMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except boss music
     */
    public static void stopAllExceptBossPre()
    {
        fightingMusic.stop();
        firstWorldMusic.stop();
        deathMusic.stop();
        victoryMusic.stop();
        bossMusic.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except fighting music
     */
    public static void stopAllExceptFighting()
    {
        bossMusic.stop();
        deathMusic.stop();
        firstWorldMusic.stop();
        victoryMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except world 1 music
     */
    public static void stopAllExceptWorld1()
    {
        fightingMusic.stop();
        bossMusic.stop();
        victoryMusic.stop();
        deathMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except world 2 music
     */
    public static void stopAllExceptWorld2()
    {
        fightingMusic.stop();
        bossMusic.stop();
        victoryMusic.stop();
        deathMusic.stop();
        bossMusicPre.stop();
        firstWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except death music
     */
    public static void stopAllExceptDeath()
    {
        fightingMusic.stop();
        bossMusic.stop();
        firstWorldMusic.stop();
        victoryMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except victory music
     */
    public static void stopAllExceptVictory()
    {
        fightingMusic.stop();
        bossMusic.stop();
        firstWorldMusic.stop();
        deathMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        templeMusic.stop();
    }
    
    /**
     * Stops music except temple music
     */
    public static void stopAllExceptTemple()
    {
        fightingMusic.stop();
        bossMusic.stop();
        firstWorldMusic.stop();
        deathMusic.stop();
        bossMusicPre.stop();
        secondWorldMusic.stop();
        victoryMusic.stop();
    }
}
