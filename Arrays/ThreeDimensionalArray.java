import java.util.*;
class ThreeDimensionalArray
{
	public static void main(String[] args) 
	{
	  int [][][] a={{{10,20},{30,40}},{{50,60},{70,80}}};

	  //for loop
	  // for(int i=0;i<a.length;i++)
	  // {
	  // 	for(int j=0;j<a[i].length;j++)
	  // 	{
	  // 		for(int k=0;k<a[i][j].length;k++)
	  // 		{
	  // 			System.out.print(a[i][j][k]+" ");
	  // 		}
	  // 	}
	  // }	
zz

	  //using while-loop

	  // int i=0;
	  // while(i<a.length)
	  // {
	  // 	int j=0;
	  // 	while(j<a[i].length)
	  // 	{
	  // 		int k=0;
	  // 		while(k<a[i][j].length)
	  // 		{
	  // 			System.out.print(a[i][j][k]+" ");
	  // 			k++;
	  // 		}
	  // 		j++;
	  // 	}
	  // 	i++;
	  // }

	  // int i=0;
	  // do{
         
      //    int j=0;
      //    do{
      //    	int k=0;
      //       do{
      //         System.out.print(a[i][j][k]+" ");
      //         k++;
      //       }while(k<a[i][j].length);
      //    	j++;
      //    }while(j<a[i].length);
	  // 	i++;
	  // }while(i<a.length);

	  //forEach Loop

	  for(int [][]i:a)
	  {
	  	for(int j[]:i)
	  	{
	  		for(int k:j)
	  		{
	  			System.out.print(k+" ");
	  		}
	  	}
	  }
	}
}