//write a java program to get the ascii values of all the characters dynamically
import java.util.Scanner;
class GetAsciiValue
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the name ");
	   String name=sc.next();

	    for(int i=0;i<name.length();i++)
	     {
	    	char ch=name.charAt(i);
            int asciiData=ch; //widening
            System.out.print(asciiData+" ");
           
	    }

	}
}