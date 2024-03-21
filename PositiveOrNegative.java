import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		double num=sc.nextDouble();

		if(num>0)
		{
			System.out.println("The given Number is Positive");
		}
		else 
		{
			System.out.println("The given Number is Negative");
		}
	}
}