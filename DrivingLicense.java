import java.util.Scanner;
class DrivingLicense
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Your age is Eligible ");
			System.out.print("Enter your RTO test score : ");
			double score=sc.nextDouble();
			if(score>=60){
				System.out.println("You are Eligible for Driving License");
			}
			else{
				System.out.println("You are not eligible for Driving License Re-appeared for it next time ");
			}
		}
		else{
			System.out.println("You are not Eligible try after "+(18-age)+"years");
		}
	}
}