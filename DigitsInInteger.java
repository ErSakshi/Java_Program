import java.util.Scanner;
class DigitsInInteger
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number between 0 and 1000 :");
		int num=sc.nextInt();
		int r,s,sum=0;
		 while(num>0)
		 { 
		 	
            s=num%10;
            sum=sum+s;
            num=num/10;
		 }
		
		System.out.println("Sum of digits:"+sum);
		
		
		
	}
}