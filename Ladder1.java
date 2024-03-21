import java.util.Scanner;
class Ladder
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your percentage");
		double percent=sc.nextDouble();
		if(percent<35)
		{
			System.out.println("You are fail ");
		}
		else if(percent>35&&percent<60)
		{
			System.out.println("Your grade is B ");
		}
		else if(percent>60&&percent<750)
		{
			System.out.println("Your grade is A");

		}
		else if(percent>75&&percent<90)
		{
			System.out.println("Your grade is A+");
		}
		else
		{
			System.out.println("Your grade is O");
		}
	}
}