import java.util.Scanner;
class SumDigits
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		 int sum=0;

		 while(num>0){   //123>0
            int rem=num%10; //1.rem=123%10=3 2.rem=12%10=2 3.rem=1%10=1
            sum+=rem;       //1.sum=0+3=3    2.sum=3+2=5   3.sum=5+1=6
		 	num/=10;        //1.123/10=12    2.12/10=1     3.1/10=0
		 }
		 System.out.println("sum is "+sum);
	}
}