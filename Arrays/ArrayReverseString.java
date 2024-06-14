//write a java program to reverse the string
class ArrayReverseString
{
	public static void main(String[] args) 
	{
		String names[]={"Ramesh","Suresh","Mahesh","Ganesh","Mukesh"};

		for(int i=names.length-1;i>=0;i--)
		{
			System.out.print(names[i]+" ");
		}
	}
}