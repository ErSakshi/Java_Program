import java.util.Scanner;
class ComputingBMI
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the weight in pounds : ");
		double weight=sc.nextDouble();
		System.out.print("Enter the height in inches : ");
		double height=sc.nextDouble();
		double onePound=0.45359237;
		double oneInch=0.0254;
		double BMI=(weight*onePound)/(height*oneInch*height*oneInch);
		System.out.println("Body Mass Index is : "+BMI);
	}
}