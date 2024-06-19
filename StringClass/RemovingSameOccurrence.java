import java.util.Scanner;
class RemovingSameOccurrence
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the String : ");
	   String str=sc.next();
	   System.out.println("Enter the Character to remove Occurrence : ");
	   String ch=sc.next();
      
       String modified=str.replace(ch,"");
       System.out.println(modified);


	  

	}
}