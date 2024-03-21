import java.util.Scanner;
class CalculateInterest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the balance and interest rate :");
		double balance=sc.nextDouble();
		double annualInterestRate=sc.nextDouble();
		double interest=balance*(annualInterestRate/1200);
		System.out.println("The interest for the next month is : "+interest);
	}
}