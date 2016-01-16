/**
 * Write a description of class Obs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class ObstacleCreator  
{

   public static Vehicle makeObstacleCar(int verticalLaneOneActor)
	{
	
	      if(verticalLaneOneActor == 0)
        {
           return new TruckFactory().createObstacleCar();
        }else if(verticalLaneOneActor == 1)
        {
           return new PoliceFactory().createObstacleCar();
        }else
        {
           return new ObstacleCarFactory().createObstacleCar();
        }
	 
	}
	abstract public Vehicle createObstacleCar();

}
