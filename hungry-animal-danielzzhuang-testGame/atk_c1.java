import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class atk_c1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class atk_c1 extends Actor
{
    /**
     * Act - do whatever the atk_c1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int size=100;
    public void setSize(int change){
        size=change;
    }
    public void show(){
        setLocation(450, 200);
    }
    
    public void hide(){
        setLocation(450, 1000);
    }
    public void act(){
        GreenfootImage image = getImage();
        image.scale(size,size);
        setImage(image);
    }
}
