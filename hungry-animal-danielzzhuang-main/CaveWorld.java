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
    public Label roundText;
    public caveBackGround cBG;
    public gameDice_I dice_1;
    public gameDice_II dice_2;
    public gameDice_III dice_3;
    
    
    public int diceForPlayer=3;
    public int [] diceArr={0, 0, 0};
    public int round=0;
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
        
        player = new playerCharacter();        
        addObject(player, 170, 900);
    }
    //get random point for all dice
    public void getRandomDice(){
        for(int i=0; i<diceForPlayer; i++){
            dice_1.setDicePoint(1+Greenfoot.getRandomNumber(5));
            //dice_2.setDicePoint(1+Greenfoot.getRandomNumber(5));
            //dice_3.setDicePoint(1+Greenfoot.getRandomNumber(5));
        }
    }
    //show all dice player have
    /*
    public void showAllDice(){
        dice_1.show();
        dice_2.show();
        dice_3.show();
    }
    */
    
    public void act(){
        if(round==0){
            getRandomDice();
            showText(String.valueOf(diceArr[0]), 130, 300);
            showText(String.valueOf(diceArr[1]), 150, 300);
            showText(String.valueOf(diceArr[2]), 170, 300);
            player.setPlayerHp(+50);
            showText(String.valueOf(player.getPlayerHp()),150, 450);
            round+=1;
            player.show();
        }
        
    }
}
