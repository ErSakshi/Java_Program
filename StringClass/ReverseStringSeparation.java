import java.util.*;
class ReverseStringSeparation
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the String : ");
	   String str=new String(sc.next().toLowerCase());
	   int divided=str.length()/2;
	   String part1=new String();
	  String part2=new String();

	  if(str.length()%2==0)
	  {
         for(int i=0;i<divided;i++)
         {
         	char ch=str.charAt(i);
         	part1+=ch;
         }

         for(int i=str.length()-1;i>=divided;i--)
         {
         	char ch=str.charAt(i);
         	part2+=ch;
         }
	  }	
	  else 
	  {
	  	System.out.println("String is not having equal length");
	  }
	  System.out.println(part1);
	  System.out.println(part2);
  	
	}
}