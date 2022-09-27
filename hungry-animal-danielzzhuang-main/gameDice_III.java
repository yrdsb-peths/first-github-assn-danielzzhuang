import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameDice_III here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameDice_III extends Actor
{
    GreenfootImage[] gameDice_ImageStack = new GreenfootImage[7];
    public int dicePoint=3;
    /**
     * Act - do whatever the gameDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameDice_III(){
        gameDice_ImageStack[dicePoint] = new GreenfootImage("images/gameDice_ImageStack/GameUsingDice_" + dicePoint + ".png");
        setImage(gameDice_ImageStack[dicePoint]);
        gameDice_ImageStack[dicePoint].scale(180, 180);
    }
    public void setDicePoint(int point){
        dicePoint=point;
    }
    public void show()
    {
        setLocation(150, 500);
    }
    public void act()
    {
        
    }
}
