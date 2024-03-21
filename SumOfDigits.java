import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number between 100 to 999 :");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		System.out.println("Sum of Digits is "+sum+ " and the number is "+dup);
	}
}