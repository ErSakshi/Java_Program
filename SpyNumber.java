import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int product=1;

		while(num>0)
		{
			int rem=num%10;
			 sum=sum+rem;
			 product=product*rem;
			num/=10;
		}
		if(sum==product){
			System.out.println(dup+" is a Spy number");
		}
		else{
			System.out.println(dup+" is not a Spy number");
		}
	}
}