import java.util.Scanner;
class EndsWith
{
	static String str;
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String : ");
      String str=sc.nextLine();

      System.out.println("Enter the String to check : ");
      String str1=sc.next();

     
      boolean op=endsWith(str1);
     System.out.println(str+" : "+op);

      
	}
	public static boolean endsWith(String str1)
	{
		boolean flag=false;
		for(int i=str1.length()-1,j=str.length()-1;i>=0;i--,j--)
		{
			char ch=str1.charAt(i);
			if(ch==str.charAt(j))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
}