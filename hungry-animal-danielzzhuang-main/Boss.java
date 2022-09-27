import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public int bossMaxHp=500;
    public int bossMinHp=0;
    public int bossHp=500;
    /**
     * Act - do whatever the boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean bossAlive(){
        if(bossHp==0){
            return false;
        }
        return true;
    }
    public int getBossHp(){
        return bossHp;
    }
    public void setBossHp(int change){
        if(bossHp+change>bossMaxHp){
            bossHp=bossMaxHp;
        }
        else{
            bossHp+=change;
        }
    }
    public void act()
    {
        setLocation(getX(), getY());
    }
}
