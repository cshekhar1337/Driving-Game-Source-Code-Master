import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends World
{
    ButtonImage ob1, ob2, ob3,ob4,obj5;
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(600, 400, 1); 
        
         ob1 = new ButtonImage("newgame.png");
         ob2 = new ButtonImage("instructions.png");
         ob3 = new ButtonImage("highscore.png");
         ob4 = new ButtonImage("gamename.png");
         obj5 = new ButtonImage("choosecar.png");
         
        
        
        addObject(ob1,300,120);
        addObject(ob2,150,170);
        addObject(ob3,450,170);
        addObject(ob4,300,55);
        addObject(obj5,300,170);
        
    
        
        
    }
    
     public void act()
         {
             if( Greenfoot.mouseClicked(ob1) ) {
                 
                 CarWorld car = new CarWorld();
                 Greenfoot.setWorld(car);
                 
            }
            if( Greenfoot.mouseClicked(ob2) ) {
                 
                 Instructions info = new Instructions();
                 Greenfoot.setWorld(info);
                 
            }
            if( Greenfoot.mouseClicked(ob3) ) {
                HighScores score = new HighScores();
                Greenfoot.setWorld(score);
                 
                 
          
            }
            if( Greenfoot.mouseClicked(obj5) ) {
                ChooseCar choose = new ChooseCar();
                Greenfoot.setWorld(choose);
                 
                 
          
            }
            
        }
}
