import greenfoot.*;

/**
 * Write a description of class CarOtherFact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TruckFactory extends ObstacleCreator
{
    public Vehicle createObstacleCar() 
    {
       return new Truck();
    }
}
