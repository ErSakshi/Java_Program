import java.util.Scanner;
class Army
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Your age is able to join ");
			System.out.print("Enter your height in cm : ");
			double height=sc.nextDouble();
			if(height>=162){
				System.out.println("Your height is sufficient");
				System.out.print("Enter your weight in kg : ");
				double weight=sc.nextDouble();
				if(weight>=56){
					System.out.println("Your weight is sufficient for army joining");
					System.out.println("You are able to join Army");
				}
				else{
					System.out.println("Your weight is not sufficient try next time");
				}

			}
			else{
				System.out.println("Your height is not enough to join army");
			}


		}
		else{
			System.out.println("Your age is not sufficient to join army"+(18-age)+"years");
		}
	}
}
