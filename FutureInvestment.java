import java.util.Scanner;
class FutureInvestment
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enters the Investment Amount : ");
		double investmentAmount=sc.nextDouble();

		System.out.print("Enters Annual Interest rate : ");
		double interestRate=sc.nextDouble();
		double monthlyInterestRate=interestRate/12/100;

		System.out.print("Enters the number of years : ");
		double numberOfYears=sc.nextDouble();

		double futureInvestmentValue=investmentAmount*Math.pow(1+monthlyInterestRate ,numberOfYears*12);

		System.out.println("The future Investment value is : "+"$"+futureInvestmentValue);
	}
}