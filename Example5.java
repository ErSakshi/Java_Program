//write a java program to find the character is alphabet or not
import java.util.Scanner;
class Example5
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the character :");
		char ch=sc.next().charAt(0);
		System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?ch+" is a alphabet":"not a alphabet");
	}
}