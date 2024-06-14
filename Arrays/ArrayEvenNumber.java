import java.util.*;
class ArrayEvenNumber
{
	public static void main(String[] args) 
	{
	     int []arr = {1,2,3,4,5,6,7,8,9};

	     int count=0;
	     for(int i:arr)
	     {
	     	if(i%2==0)
	     	{
	     		count++;
	     	}
	     }	
	     int []evenNumber=new int[count];

	     int indx=0;
	    for(int i:arr)
	     {
	     	if(i%2==0)
	     	{
	     		evenNumber[indx++]=i;
	     	}
	     }
	     System.out.println(Arrays.toString(evenNumber));
	}
}