import java.util.Scanner;
class EmployeePay
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Monthly target Score : ");
		double score=sc.nextDouble();
		System.out.print("Enter the Amount of Payment : ");
		double payment=sc.nextDouble();
		double increaseby3=(3.0/100)*payment;
		double increaseby1=(1.0/100)*payment;

		if(score>=90)
		{
			System.out.println("The pay is increased by  "+increaseby3);
		}
		else 
		{
			System.out.println("The pay is increased by "+increaseby1);
		}


	}
}


