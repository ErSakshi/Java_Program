import java.util.*;
class OneDimensionalArray
{
	public static void main(String[] args) 
	{
	     int [] a={20,40,60,80,100};

	   // //using for loop
	   // for(int i=0;i<a.length;i++)
	   // {
	   // 	System.out.print(a[i]+" ");
	   // }


	   //using while loop

	  // int i=0;
	  //   while(i<a.length)
	  //  {
	  //  	System.out.print(a[i]+" ");
	  //  	i++;
	  //  }


        // do-while loop
	   // int i=0;
	   // do{

	   // 	System.out.print(a[i]+" ");
	   // 	i++;
	   // }while(i<a.length);	

	  
	   //forEach loop

	   for(int i:a)
	   {
         System.out.print(i+" ");
	   }
	}
}