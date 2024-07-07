import java.util.*;
class DuplicateCharacters
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the String  : ");
	   String str=sc.next();
	   String str1=new StringBuffer();

	   String []s=new String[str.length()];

        int count=0;
	   for(int i=0;i<str.length();i++)
	   {
	   	char ch=str.charAt(i);
	     s[i]=ch;
         }
         for(int i=0;i<str.length();i++)
         {
         	for(int j=0;j<str.length();j++)
         	{
         		if(s[i]==s[j])
         			count++;
         	
         	if(count>1)
         	{
         		System.out.print(str1.delete(count));
         	}
         }
         }	

	}
}