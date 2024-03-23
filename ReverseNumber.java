import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int rev=0;

		while(num>0){    //int num=123  123>0 12>0  1>0
          int rem=num%10;  //rem=123%10=3  rem=12%10=2  rem=1%10=1
         
          rev=rev*10+rem;   // rev=0*10+3  rev=3*10+2=32  rev=32*10+1=321
          num/=10;          //123/10=12 12/10=1  1/10
		}
		System.out.println(rev);
	}
}