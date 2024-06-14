import java.util.*;
class SumProduct2D
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the Number of rows :");
     int rows=sc.nextInt();

     System.out.println("Enter the Number of columns :");
     int cols=sc.nextInt();

     System.out.println("Enter the Array Elements : ");
     int [][]arr=new int[rows][cols];

     for(int i=0;i<rows;i++)
     {
     	for(int j=0;j<cols;j++)
     	{
     		arr[i][j]=sc.nextInt();
     	}
     }	

      int sum=0;
      int prod=1;
     for(int i=0;i<rows;i++)
     {
     	for(int j=0;j<cols;j++)
     	{
     		System.out.print(arr[i][j]+" ");
     		sum=sum+arr[i][j];
     		prod=prod+arr[i][j];
     	}
     	System.out.println();

     }
     System.out.println(" Sum :"+sum);
     	System.out.println("Product :"+prod);

  }
}