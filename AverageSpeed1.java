class AverageSpeed1
{
  public static void main(String []args)
  {
    double distance=14;
    double oneMile=1.6;
    
    double hours=1;
    double minutes=45.5;
    double seconds=30;
    double minutesInHour=minutes/60;
    double secondsInHour=seconds/60*60;
    double distanceInMiles=distance/oneMile;
    double timeInHours= minutesInHour+secondsInHour;
    double milesPerHour=(distanceInMiles/timeInHours);
 
    System.out.println("The Average Speed in miles per Hour :"+milesPerHour);
   }
}