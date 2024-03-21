import  java.util.*;
class Temperature
{
  public static void main(String []args)
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Celcius :");
    double celsius=in.nextDouble();
   
    double fahrenheit=(9.0/5)*celsius+32;

    System.out.println("Temperature in Fahrenheit - "+fahrenheit);
  }
}
   