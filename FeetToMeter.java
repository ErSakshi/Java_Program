import java.util.Scanner;
class FeetToMeter
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double oneFoot=0.305;
     	System.out.print("Enter a value for feet :");
     	double feet=sc.nextDouble();
     	double meters=(feet*oneFoot);
     	System.out.println("feet is "+meters +"meters");

		
	}
}