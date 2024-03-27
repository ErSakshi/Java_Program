import java.util.Scanner;
class PalindromeName2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name : ");
		StringBuffer name=new StringBuffer(sc.next());
		String name1=name.toString();
		String revname=(name.reverse()).toString();
		System.out.println(name1);
		System.out.println(revname); 
	}
}