import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class caveBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caveBackGround extends Actor
{
    /**
     * Act - do whatever the caveBackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=0;
    public void act()
    {
        
        if(x==1){
           setLocation(getX()-2, getY()); 
           x-=0;
        }
        else{
            x+=1;
        }
        
    }
}
