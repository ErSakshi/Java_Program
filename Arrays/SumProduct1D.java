tttt//write a java program to get the sum and product in a single dimension array
import java.util.*;
class SumProduct1D
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Arary : ");
		int size=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		int []arr=new int[size];

		int sum=0;
		int prod=1;

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			prod=prod+arr[i];
		}
		System.out.println("Sum is :"+sum);
		System.out.println("Product is :"+prod);
	}
}