import java.util.Scanner;
class DigitsOrNot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		System.out.println((num>=0&&num<=9)?"is a digit" :"is not a digit");


	}
}