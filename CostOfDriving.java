import java.util.Scanner;
class CostOfDriving
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the driving distance :");
		double distance=sc.nextDouble();
		System.out.print("Enter miles per gallon : ");
		double milesPerGallon=sc.nextDouble();
		System.out.print("Enter price per gallon : ");
        double pricePerGallon=sc.nextDouble();
        double costOfDrive=(pricePerGallon/milesPerGallon)*distance;
        System.out.println("The cost of Driving : "+"$" +costOfDrive);
		

	}
}