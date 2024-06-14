import java.util.*;
class ArrayLoopExample
{
	public static void main(String[] args) 
	{
	   int [][] a={{10,20,30},{40,50},{60,70,80,90}};

	   // for(int i=0;i<a.length;i++)
	   // {
	   // 	  for(int j=0;j<a[i].length;j++)
	   // 	  {
	   // 	  	System.out.print(a[i][j]+" ");
	   // 	  }
	   // }	


	   // int i=0;
	   // while(i<a.length)
	   // {
	   // 	int j=0;
	   // 	while(j<a[i].length)
	   // 	{
	   // 		System.out.print(a[i][j]+" ");
	   // 		j++;
	   // 	}
	   // 	i++;
	   // }


	   for(int[]i:a)
	   {
	   	for(int j:i)
	   		System.out.print(j+" ");
	   }
	}
}