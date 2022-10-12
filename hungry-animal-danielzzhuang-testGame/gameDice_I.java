import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameDice_I extends Actor
{
    GreenfootImage[] gameDice_idle = new GreenfootImage[6];
    public boolean pickUp;
    public int dicePoint;
    /**
     * Act - do whatever the gameDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameDice_I(){
        
    }
    public void setDice1Point(int point){
        dicePoint=point+1;
    }
    public int getDice1Point(){
        return dicePoint;
    }
    public void show()
    {
        setLocation(60, 560);
    }
    public void hide()
    {
        setLocation(-50, 560);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this)) pickUp = true;
        if(Greenfoot.mouseClicked(null)) pickUp = false;
        if(pickUp){
            MouseInfo info = Greenfoot.getMouseInfo();
            setLocation(info.getX(), info.getY());
        }
        
        gameDice_idle[dicePoint] = new GreenfootImage("images/gameDice_idle/GameUsingDice"+dicePoint+".png");
        setImage(gameDice_idle[dicePoint]);
        gameDice_idle[dicePoint].scale(100, 100);
    }
}
