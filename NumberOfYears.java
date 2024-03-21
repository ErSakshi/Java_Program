import java.util.Scanner;
class NumberOfYears
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the minutes :");
		int minutes=sc.nextInt();

		int years=minutes/525600;
		int days=minutes/1440;

		System.out.print("minutes is "+minutes  +" years is "+years  +" days is "+days);

	}
}