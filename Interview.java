import java.util.Scanner;
class Interview
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your percentage : " );
		double percent=sc.nextDouble();

		if(percent>=60)
		{
			System.out.println("You are eligible for the Interview");
		}
		else 
		{
			System.out.println("You are not eligible for Interview");
		}

		
	}
}