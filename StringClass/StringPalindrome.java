//WAJP to know is the String is palindrome
import java.util.*;
class StringPalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		String str=sc.next();

		String rev="";

		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
			System.out.print(str+" is Palindrome");

		else 
			System.out.print(str+" is not a Palindrome");
	}
}
