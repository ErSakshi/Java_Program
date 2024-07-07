//write a java program to reverse the worlds in a sentence
//String= qspiders training institude
//[sredipsq,gniniart,edutitsni];
import java.util.*;
class ReversingSentence
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
       
       
       System.out.println("Enter the String : ");
       
       String str=sc.nextLine();
       String[] str1=str.split(" ");
        String op="";

      for(String i:str1)
        {
      	op=op+(new StringBuffer(i).reverse().toString())+" ";
     }

    System.out.println(op);
     

     
	}
}