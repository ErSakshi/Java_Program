import java.util.Scanner;
class LargestNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1 :");
		int num1=sc.nextInt();
		System.out.print("Enter the num2 :");
		int num2=sc.nextInt();
		System.out.print("Enter the num3  :");
		int num3=sc.nextInt();
		int max1=(num1>=num2)?num1:num2;
		int max=(max1>=num3)?max1:num3;
		
		

		System.out.println(num1+","+num2+ ","+num3+ " greatest number among three is " +max);
	}
}