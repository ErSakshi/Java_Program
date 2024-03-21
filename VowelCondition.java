import java.util.Scanner;
class VowelCondition
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch=sc.next().charAt(0);

		if(ch=='a'||ch=='A'){
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='e'||ch=='E'){
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='i'||ch=='I'){
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='o'||ch=='O'){
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='u'||ch=='U'){
			System.out.println(ch+" is a vowel");
		}
		else{
			System.out.println(ch+" is a consonent");
		}
	}
}