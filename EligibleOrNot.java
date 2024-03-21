import java.util.Scanner;
class EligibleOrNot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age=sc.nextInt();

		
		System.out.print("Enter your property : ");
		double property=sc.nextDouble();

        // if the statement is not executed in if else condition
        //sc.nextLine(); // option 1 use nextLine()
		//Scanner sc1=new Scanner(System.in); // option 2   to createnew scanner object
		//sc.reset();  //option 3 reset the scanner object
		System.out.print("Enter the surname : ");
		String surname=sc.next().toUpperCase();


		
       if((age>=21 && property>=10000000)||(surname.equals("AMBANI")))
		{
			System.out.println(" You are Eligible to marriage");
			
		}
		else
		{
			System.out.println("You are  not eligible to marriage");
			

		}

	}
}