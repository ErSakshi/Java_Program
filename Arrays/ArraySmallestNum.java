import java.util.*;
class ArraySmallestNum
{
  public static void main(String[] args) 
  {
     int []arr={1,4,5,8,9,7};
     int min=arr[0];

     for(int i=0;i<arr.length;i++)
     {
           if(arr[i]<min)
           {
           	min=arr[i];
           }

     }	
     System.out.println(min);


     int max=arr[0];

     for(int i=0;i<arr.length;i++)
     {
           if(arr[i]>max)
           {
            max=arr[i];
           }

     }  
     System.out.println(max);


  }
}