import java.util.Scanner;
class CalculatingEnergy
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Amount of water in kilograms :");
		double waterInKilograms=sc.nextDouble();
		System.out.print("Enter the initial temperature :");
		double initialTemp=sc.nextDouble();
		System.out.print("Enter the final tempearture :");
		double finalTemp=sc.nextDouble();
		

		double joules=waterInKilograms*(finalTemp-initialTemp)*4184;
		System.out.println("Energy needed to heat water : "+joules);


	}

}