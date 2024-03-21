import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your percentage : ");
		double percent=sc.nextDouble();
		if(percent<35)
		{
			System.out.println("You are fail in the exam");
		}
		else if(percent<60){
			System.out.println("passed in the exam");
			System.out.println("Your grade is B second class");
		}
		else if(percent<75)
		{
			System.out.println("You cleared the exam with little hardwork ");
			System.out.println("Your grade is A first class");
		}
		else if(percent<90)
		{
			System.out.println("Well-done keep it up");
			System.out.println("Your grade is A+");

		}
		else if(percent<=100)
		{   
			System.out.println("Outstanding Performance");
			System.out.println("Your grade is O");
		}
		
		else{
			System.out.println("Invalid Percentage");
		}
	}
}