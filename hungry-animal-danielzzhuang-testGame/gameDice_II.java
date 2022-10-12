import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameDice_II here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameDice_II extends Actor
{
    GreenfootImage[] gameDice_idle = new GreenfootImage[6];
    public int dicePoint;
    /**
     * Act - do whatever the gameDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameDice_II(){
        
    }
    public void setDice2Point(int point){
        dicePoint=point+1;
    }
    public int getDice2Point(){
        return dicePoint;
    }
    public void show()
    {
        setLocation(120, 560);
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
