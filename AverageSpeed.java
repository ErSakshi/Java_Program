class AverageSpeed
{
  public static void main(String []args)
  {
    double distanceInMiles=24;
    double oneMile=1.6;
    double hours=1;
    double minutes=40;
    double seconds=35;
    double minutesInHours=minutes/60;
    double secondsInHours=seconds/3600;
    double totalTime=hours+minutesInHours+secondsInHours;
    double distanceInKilometer=distanceInMiles*oneMile;
    double kilometerPerHour=distanceInKilometer/totalTime;
    
  
    System.out.println("The Average Speed in Kilometer per Hour"+kilometerPerHour +"km/hrs");

  }
}  
 





