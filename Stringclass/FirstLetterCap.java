//write a java program to convert first letter into capital and rest into lowercase
import java.util.Scanner;
class FirstLetterCap
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Name : ");
     String name=sc.next().toLowerCase();

     String firstletter=name.substring(0,1).toUpperCase();
     String remaining=name.substring(1,name.length());
      String merge=firstletter.concat(remaining);

     System.out.println(merge);	
  }
}