import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num;i++)//if we take number greater than 2 if we that number than any one of the number
			//if it is equals to zero then that number is not a prime number if its condition becomes false 
			//then it writtens number is not a prime number
		{
			if(num%i==0){
				flag=false;
				break;
			}
		}
		System.out.println(flag?"Number is Prime":"Number is not Prime");
	}
}