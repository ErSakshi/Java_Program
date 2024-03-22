//for calculating power.
import java.util.Scanner;
class PowerLength
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		//power=length
		int power=1;

		while(num!=0){  //if we take num=12 so 12!=0
          length++; //initial value of length is 0(1)
          num/=10;  //given num is divided by 10 so last digit is skip 12/10=1 =>1(2)
          
		}
		System.out.println("Length of number is "+length); //after updation length =2


		for(int i=1;i<=length;i++) //here 1<=2 so power=power*dup  initialpower=1
			                       //1. 1=1*12=12  //2. 12*12=144
		power*=dup;
	System.out.println("Power of number is "+power);
	}
}