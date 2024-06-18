import java.util.Scanner;
class CountingCharacters
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String : ");
	  String str=sc.next();

	  System.out.println("Enter the Character to get count : ");
	  char ch=sc.next().charAt(0);
	  int count=0;

	  for(int i=0;i<str.length();i++)
	  {
	  	   char ch2=str.charAt(i);
	  		if(ch==ch2)
	  		{
               count++;

            }
           
	  	}
	  	System.out.println("Count of "+ch+" is "+count);
	  }

	}
