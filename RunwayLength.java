import java.util.Scanner;
class RunwayLength
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter speed and acceleration : ");
		double v=sc.nextDouble();
		double a=sc.nextDouble();
		double minRunwayLength=(v*v) /(2*a);
		System.out.println("The minimum Runway Length for this airplane is : "+minRunwayLength +"meters");
	}
}