import java.util.Scanner;
class KrishnaMurthy
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
	
		int dup=num;
		int sum=0;
	

        while(num>0){
        	int rem=num%10;  //145%10=5  14%10=4
        	int fact=1;
		for(int i=rem;i>=1;i--){ //1. i=5 ;5>=1;5--
                                 //2. i=4;4>=1;4--
			                     //3. i=3;3<=1;3--
			                     //4. i=2;i<=1;2--
			                     //5. i=1;i<=1;1--
			                     //6. i=0;i<=1; condition is false loop is  terminate

            fact*=i;  //1.fact=5*4*3*2*1  2.fact=4*3*2*1  3.fact=1
        }
			num/=10;   // 145/10=14  14/10  1/10 0/10 loops terminate
			sum+=fact;   // 0+120  120+24+1=145
			
			}
		
	     
	      if(sum==dup){ //sum=145 and num=145
	      	System.out.println(dup+" is a KrishnaMurthy Number ");
	      }
	      else{
	      	System.out.println(dup+" is not a KrishnaMurthy Number ");
	      }
		}
}

























