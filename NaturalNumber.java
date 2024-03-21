import java.util.Scanner;
class NaturalNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		double num=sc.nextDouble();
		if(num>0){
			System.out.println("The given number is POSITIVE");
		}
		else if(num<0){
			System.out.println("The given number is NEGATIVE");
		}
		else{
			System.out.println("The given number is NEUTRAL ");
		}
	}
}