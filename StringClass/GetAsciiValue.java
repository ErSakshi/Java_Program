//WAJP to get ASCII value of all characters dianamically
import java.util.*;
class GetAsciiValue
{
	public static void main(String[] args) 
	{
	   	Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter the String : ");
	   	String name=sc.next();

	   	for(int i=0;i<name.length();i++)
	   	{
	   		char ch=name.charAt(i);
	   		int ascii=ch;  //widening
	   		char prt=(char)ascii; //NARROWING
	   		int prt2=prt+32;
	   		char prt3=(char)prt2;
 
           //System.out.println(prt);
	   		System.out.println(prt3) ;
	   	}

	}
}