

 import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :  ");
		int num=sc.nextInt();
		int dup=num; //we have take duplicate of number because num becomes zero at one time
		int dup1=num; //we have take dup1
		int sum=0;
		int length=0;

		while(num!=0){ //if num is not equal to 0 then
			length++; //length is updated next time
			System.out.println("length is "+length); 
             num/=10;  //if num is divided by 10 it skips last digit
             // length=no.of iterations 
             //1) 153/10=15   2) 15/10=1  3)1/10=0  so length=10
			
			System.out.println("number is "+num);
		}
		

		while(dup>0){   //if dup>0 then 1.  153>0 so 153/10=15 =>0(1) 
			int rem=dup%10; //2.15/10=1 =>1(2)  3.1/10=0 =>2(3)
  
			int power=1; // after updation=3


			for(int i=1;i<=length;i++){ //length=3 
				power=power*rem;  //1<=3 1. 1*3=3   2<=3 2.3*3=9  3<=3 3.9*3=27
				                  //1*5=5  2.5*5=25  3.25*5=125
				                  //1.1*1=1  2.1*1=1  3.1*1=1
				System.out.println("power is "+power);
			}
			sum+=power; //initial sum=0  0+27=27  27+125=152 152+1=153
			dup/=10;
			System.out.println("sum of power is "+sum);

		}
		if(sum==dup1)
		{
			System.out.println("Number is Armstrong Number");

		}
		else{
			System.out.println("Number is not Armstrong Number");
		}
	}
}