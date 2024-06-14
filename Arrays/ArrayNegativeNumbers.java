//write a java program to fecth the negative numbers in an array
class ArrayNegativeNumbers
{
	public static void main(String[] args) 
	{
	   int arr[]={-12,11,-13,-14,15,16};

	   for(int i=0;i<arr.length;i++)
	   {
	   	if(arr[i]<0)
	   	{
	   		System.out.println(arr[i]+" is an negative number");
	   	}
	   }	
	}
}