import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameDice_III here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameDice_III extends Actor
{
    GreenfootImage[] gameDice_idle = new GreenfootImage[6];
    public int dicePoint;
    /**
     * Act - do whatever the gameDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameDice_III(){
        
    }
    
    public void setDice3Point(int point){
        dicePoint=point+1;
    }
    public void show()
    {
        setLocation(180, 560);
    }
    public void hide()
    {
        setLocation(-50, 560);
    }
    public void act()
    {
        gameDice_idle[dicePoint] = new GreenfootImage("images/gameDice_idle/GameUsingDice"+dicePoint+".png");
        setImage(gameDice_idle[dicePoint]);
        gameDice_idle[dicePoint].scale(100, 100);
    }
}
