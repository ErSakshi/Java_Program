import java.util.Scanner;
class AreaOfHexagon
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the  length of side of hexagon: ");
		double s=sc.nextDouble();
	
		double area=3*Math.sqrt(3)/2*(s*s);
		System.out.println("Enter the area of Hexagon is : "+area);
		
	}
}