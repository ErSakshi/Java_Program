import java.util.Scanner;
class CharacterOrNot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch=sc.next().charAt(0);
	
		System.out.println((ch>=0&&ch<=65535)?"is a character":"not a character");
		
	}
}