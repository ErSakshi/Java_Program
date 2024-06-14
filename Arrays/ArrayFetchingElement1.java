//write a java program to find an element in an array
class ArrayFetchingElement1
{
	public static void main(String[] args) 
	{
		
	  int arr[]={2,3,57,90,22};
      int key=57;
      boolean flag=true;
      int i;
	  for( i=0;i<arr.length;i++)
	  {
         if(key==arr[i])
         {
         	System.out.print("Element found in position : "+(i+1));  // we have to print position not index
           flag=false;
           break;
       }
	  }
	  if(flag)
	  {
	  	System.out.print("Element is not found");
	  }	
	}
} 