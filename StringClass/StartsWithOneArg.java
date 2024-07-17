import java.util.Scanner;

class StartsWithOneArg
{
	 static String str;
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
       System.out.print("Enter the String : ");
       String str=sc.next();

       System.out.print("Enter the String to check : ");
       String str1=sc.next();

       boolean op=startsWithOneArg(str1);
       System.out.println(str+" : "+op);
	}
	public static boolean startsWithOneArg(String str1)
	{
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			if(char ch=str1.charAt(i))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}