import java.util.*;
class TwoDimensionalArray
{
	public static void main(String[] args) 
	{
	   int [][]a={{10,20,30},{40,50,60},{70,80,90,100}};

	   //using for-loop
	   // for(int i=0;i<a.length;i++)
	   // {
	   // 	for(int j=0;j<a[i].length;j++)
	   // 	{
	   // 		System.out.print(a[i][j]+" ");
	   // 	}
	   // }	


	   //using while loop

	   
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

	   //using do-whileLoop

	   // int i=0;
	   
	   // do{
	   // 	int j=0;
	   // 	do{
	   // 		System.out.print(a[i][j]+" ");
	   // 		j++;
	   // 	}while(j<a[i].length);
       //  i++;
	   // }while(i<a.length);

	   

	   //forEach loop

	   for(int i[]:a)
	   {
	   	for(int j:i)
	   	{
	   		System.out.print(j+" ");
	   	}
	   }
	}
}