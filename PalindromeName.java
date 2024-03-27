import java.util.*;
class PalindromeName
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name=sc.next();
		String revname="";
		for(int i=name.length()-1;i>=0;i--){

			revname+=name.charAt(i);

		}
		System.out.println("Reverse name is "+revname);
		System.out.println((revname.equals(name))?name+" is a PalindromeName":name+" is not a PalindromeName");
	}
}