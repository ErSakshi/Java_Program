import java.util.*;
class  Assesment103
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the size of array : ");
	   int size=sc.nextInt();
	   System.out.println("Enter the elements of an Array : ");

	   int[]num=new int[size];

       
	   for(int i=0,j=0;i<size;i++,j++)
	   {
	   	num[i]=sc.nextInt();

	   	 for(int k=0,l=0;k<size-1;k++,l++)
	   	 {
	   	 	 sum[k]=num[l]+num[j];
	   	 }
       }
	   
	  
	   System.out.println(Arrays.toString(num));
	   System.out.println(Arrays.toString(sum));	
	}
}
