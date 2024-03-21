import java.util.Scanner;
class VowelOrConsonent
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch=sc.next().charAt(0);
		System.out.println(((ch=='a')||(ch=='i')||(ch=='e')||(ch=='o')||(ch=='u'))? ch+" is a vowel": ch+" is a consonent");



	}
}