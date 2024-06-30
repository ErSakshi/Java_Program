import java.util.*;
class FactorsOfNumber
{
	 static Scanner sc=new Scanner(System.in);

	StringBuffer factors=new StringBuffer();

    
	public void  factors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				factors.append(i+" /n");
				System.out.print(factors);

			}
		}
		
	}
	public static void main(String[] args)
	 {
	 	FactorsOfNumber obj=new FactorsOfNumber();

        System.out.println("Enter the Number :");
        int num=sc.nextInt();

	    obj.factors(num);
	    

	}
}