import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrrt=0;
        int nnum=num;
        
         int sum=nnum+1;


		for(int i=1;i<=sum/2;i++)
		{
			if(i*i==sum){

				flag=true;
				sqrrt=i;
				 break;
			}

			
		}
		if(flag){
			System.out.println(sum+" is a Sunny number ");
		}
		else{
			System.out.println(num+" is not a Sunny Number ");
		}


	}
}