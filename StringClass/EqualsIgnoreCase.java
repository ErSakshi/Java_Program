import java.util.Scanner;
class EqualsIgnoreCase
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the String ");
	   String str1=sc.next();
	   System.out.println("Enter the String to compare :");
	   String str2=sc.next();

 
        boolean op=equalsIgnoreCase(str1,str2);	
	
	   System.out.println(str1+" : "+op);
    }
    public static boolean equalsIgnoreCase(String str1,String str2)
    {
    	for(int i=0;i<str2.length();i++)
    	{
    		char ch1=str1.charAt(i);
    		char ch2=str2.charAt(i);

    		if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2) && Character.toUpperCase(ch1)!=Character.toUpperCase(ch2))
    		{
    			return false;
    		}
    		
    	}
    	return true;
    }

}