import java.util.Scanner;
class PoundsToKilogram
{
	public static void main(String []args) {
		  

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number in pounds :");
		double pounds=sc.nextDouble();
		double kilograms=pounds*0.454;
		System.out.print("pounds is "+kilograms +"kilograms");
	}
}