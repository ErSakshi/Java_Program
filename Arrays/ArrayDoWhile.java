import java.util.*;
class ArrayDoWhile
{
	public static void main(String[] args)
	 {
	   int [] arr={10,20,30,40};

	   int i=0;
	   do{
	   	System.out.print(arr[i++]+" ");
     }while(i<arr.length);	
	}
}