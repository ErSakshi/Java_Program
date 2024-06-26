import java.util.Scanner;
class ConcatMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String 1 : ");
	  String str1=sc.next();
	  System.out.println("Enter the String 2 : ");
	  String str2=sc.next();



	  String combine=userConcatMethod(str1,str2);
	  System.out.println(str1+" + "+str2+" = "+combine);	
	}
	public static String userConcatMethod(String str1,String str2)
	{
		if(str1==null)
		{
			str1="";
		}
		if(str2==null)
		{
			str2="";
		}
		char []arr=new char[str1.length()+str2.length()];

		for(int i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}

		for(int i=0;i<str2.length();i++)
		{
			arr[str1.length()+i]=str2.charAt(i);
		}
		return new String(arr);
	}
}