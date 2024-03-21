import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enters v0,v1,t :");
		double v0=sc.nextDouble();
		double v1=sc.nextDouble();
		double t=sc.nextDouble();
		double acceleration=(v1-v0)/t;
		System.out.println("Acceleration : "+acceleration);
	}
}