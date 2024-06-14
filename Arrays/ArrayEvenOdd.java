//write a java program to find the even and odd numbers in an array using the first syntax
class ArrayEvenOdd
{
	public static void main(String[] args) {
		int arr[]={112,222,323,400,515};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is an even number");
			}
			else{
				System.out.println(arr[i]+" is an odd number");
			}
		}
	}
}