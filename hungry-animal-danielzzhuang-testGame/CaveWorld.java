import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaveWorld extends World
{
    public playerCharacter player;
    public boss boss;
    public atk_I atk1;
    public atk_c1 atkC1;
    public Label playerHpText;
    public caveBackGround cBG;
    public gameDice_I dice_1;
    public gameDice_II dice_2;
    public gameDice_III dice_3;
    
    public int skill=0;
    public int diceC=0;
    public int diceForPlayer=3;
    public int round=0;
    
    public boolean fixed=false;
    MouseInfo mouse = Greenfoot.getMouseInfo();
    SimpleTimer skillC = new SimpleTimer();
    SimpleTimer cBGTimer = new SimpleTimer();
    SimpleTimer diceTimer = new SimpleTimer();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CaveWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1, false);
        cBG = new caveBackGround();
        addObject(cBG, 900, getHeight()/2);
        
        atkC1 = new atk_c1();
        addObject(atkC1, getWidth()/2, 1000);
        
        dice_1 = new gameDice_I();
        addObject(dice_1, 100, 900);
        
        dice_2 = new gameDice_II();
        addObject(dice_2, 100, 900);
        
        dice_3 = new gameDice_III();
        addObject(dice_3, 100, 900);
        
        
        boss = new boss();
        addObject(boss, 770, 900);
        
        player = new playerCharacter();        
        addObject(player, 170, 900);
        
        
        
        atk1 = new atk_I();
        addObject(atk1, 100, 900);
    }
    //get random point for all dice
    public void getRandomDice(){
        dice_1.setDice1Point(Greenfoot.getRandomNumber(5));
        dice_2.setDice2Point(Greenfoot.getRandomNumber(5));
        dice_3.setDice3Point(Greenfoot.getRandomNumber(5));
    }
    //show all dice player have
    public void showAllDice(){
        dice_1.show();
        dice_2.show();
        dice_3.show();
    }
    public void hideAllDice(){
        dice_1.hide();
        dice_2.hide();
        dice_3.hide();
    }
    public void fix(){
        if( (Math.abs(dice_1.getX()-atkC1.getX())<50) || (Math.abs(dice_1.getY()-atkC1.getY())<50) ){
            //dice_1.setLocation(door.getX(), door.getY());
            boss.setBossHp(-10*dice_1.getDice1Point());
            dice_1.hide();
            
        }
    }
    
    public void act(){
        
        if(round==0){
            getRandomDice();
            showAllDice();
            player.show();
            boss.show();
            
            atkC1.show();
            //boss.setBossHp(-100);
            round+=1;
        }
        
        fix();
        showText(String.valueOf(player.getPlayerHp()),150, 400);
        showText(String.valueOf(boss.getBossHp()),770, 370);
        
        
        
        
        
    }
}
