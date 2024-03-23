import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;

		while(num>0){   //121>0
			int rem=num%10;  //1.rem=121%10=1; 2.rem=12%10=2;   3.1%10=1 
			rev=rev*10+rem;  //rev=0*10+1=1    2.rev=1*10+2=12  3.rev=12*10+1=121
			num/=10;         //1.121/10=12     2.12/10=1        3.1/10=0
		}
		System.out.println((dup==rev)?"Number is Palindrome":
			"Number is not Palindrome");
	}
}