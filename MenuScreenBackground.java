import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreenBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreenBackground extends Actor
{
    /**
     * Act - do whatever the MenuScreenBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private GreenfootImage image1;
     private GreenfootImage image2;
     
    public MenuScreenBackground()
    {
        image1 = new GreenfootImage("gameoverimage.jpg");
        
        addimagetobackground();
        
        
    }
     
    public void addimagetobackground(){
        setImage(image1);
    }
}
