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
    public Label playerHpText;
    public caveBackGround cBG;
    public gameDice_I dice_1;
    public gameDice_II dice_2;
    public gameDice_III dice_3;
    
    public int diceChoose;
    public int diceForPlayer=3;
    public int round=0;
    
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
        
        dice_1 = new gameDice_I();
        addObject(dice_1, 100, 900);
        
        dice_2 = new gameDice_II();
        addObject(dice_2, 100, 900);
        
        dice_3 = new gameDice_III();
        addObject(dice_3, 100, 900);
        
        player = new playerCharacter();        
        addObject(player, 170, 900);
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
    
    
    public void act(){
        if(round==0){
            getRandomDice();
            showAllDice();
            player.show();
            round+=1;
        }
        showText(String.valueOf(player.getPlayerHp()),150, 450);
        
        /*
        if(diceTimer.millisElapsed() > 400){
            if(Greenfoot.isKeyDown("1")){
                diceChoose=1;
                diceTimer.mark();
            }
            else if(Greenfoot.isKeyDown("2")){
                diceChoose=2;
                diceTimer.mark();
            }
            else{
                diceChoose=3;
                diceTimer.mark();
            }
        }
        
        if(diceChoose==3){
            player.setPlayerHp(-10*diceChoose);
        }
        */
    }
}
