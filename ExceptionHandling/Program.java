import java.util.*;
class Program
{
	public static void main(String[] args)
	 {
	 	System.out.println(" Main Method Started");
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter the Number : ");
	   	int num=sc.nextInt();

	   	try{
	   		System.out.println(num/0);
	   	}
	   	catch(Exception e)
	   	{
	   		e.printStackTrace();
	   	}
	}
}
