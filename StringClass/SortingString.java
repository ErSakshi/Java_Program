//wajp to sort  the string element and print the string based on alphabetical order
import java.util.*;
class SortingString
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the String : ");	
	   String str=sc.next();

	   int []a=new int[str.length()];

       int itt=0;
	   for(int i=0;i<str.length();i++)
	   {
	   	  a[itt++]=str.codePointAt(i);
	   }
	  //System.out.println(Arrays.toString(a));

	  for(int i=0;i<str.length();i++)
	  {
	  	for(int j=i;j<str.length();j++)
	  	{
	  		if(a[i]>a[j])
	  		{
	  			int temp=a[i];
	  			a[i]=a[j];
	  			a[j]=temp;
	  		}
	  	}
	  }
	  //System.out.println(Arrays.toString(a));

	   	  for(int i=0;i<a.length;i++)
	   	  {
	   	  	int j=a[i];
	   	  	char ch=(char)j;
	   	  	System.out.print(ch);
	   	  }

	   

	}
}