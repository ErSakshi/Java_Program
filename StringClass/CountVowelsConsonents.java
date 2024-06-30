//WAJP to print vowels and consonents and also store the vowels and consonents in new string

import java.util.*;
class CountVowelsConsonents
{
	public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the String :");
	    String str=sc.next();

       String vowels="";
       String conso="";

      char []arr=new char[str.length()];
       for(int i=0;i<str.length();i++)
       {
       	 arr[i]=str.charAt(i);
       }
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<str.length();i++)
       {
       	 if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u')
       	 	vowels+=arr[i];
       
       else 
       	conso+=arr[i];
   }

       System.out.println("Vowels in String : "+vowels);
       System.out.println("Consonents in String :"+conso);
	}
}