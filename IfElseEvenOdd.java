import java.util.Scanner;
class IfElseEvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		double num=sc.nextDouble();

		if(num%2==0)
		{
			System.out.println("The  given number is even number");
		}
		else{
             System.out.println("The give number is odd number");
		}
	}
}