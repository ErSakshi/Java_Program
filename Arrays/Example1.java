import java.util.*;
class Example1
{
	public static void main(String[] args) {
		String [] dim={"36 36 30","47 8 60","86 86 86","46 96 90"};
		for(String i:dim)
		{
			String [] indDim=i.split(" ");
			if((indDim[0].equals(indDim[1]))&&(indDim[1].equals(indDim[2])))
			{
				System.out.println("Equilateral");
			}
			else if((indDim[0].equals(indDim[1]))||(indDim[1].equals(indDim[2])))
			{
				System.out.println("Isoceles");
			}
			else{
				System.out.println("None of these");
			}
		}
	}
}
