import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		if(age>=20){
			System.out.println("Your age is ok to donate blood ");
			System.out.print("Did you consume cigarette or alcohol within this 24 hours (yes/no) : ");
			String consume=sc.next().toLowerCase();
			if(consume.equals("yes")){
				System.out.println("you cannot able to donate blood");
			}
			else if(consume.equals("no")){
				System.out.println("You are able donate blood");
				System.out.print("Enter your weight : ");
			double weight=sc.nextDouble();
			if(weight>=50){
				System.out.println("You are healthy  so you can donate your blood ");
			}
			else{
				System.out.println("You are not healthy first you increase your weight to increase blood level ");
			}
			}
			else{
				System.out.println("Invalid input ");
			}
			
			
		}
		else{
			System.out.println("your age is not sufficient to donate blood try after "+(20-age)+" years");
		}
	}
}