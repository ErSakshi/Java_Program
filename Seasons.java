import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month : ");
		String month=sc.next().toUpperCase();
		switch(month)
		{
		case "OCTOBER":
		case "NOVEMBER":
		case "DECEMBER":
		case "JANUARY":System.out.println(month + " it's Winter." );break;
		case "FEBRUARY":
		case "MARCH":
		case "APRIL":
		case "MAY":System.out.println(month + " it's Summer.");break;
		case "JUNE":
		case "JULY":
		case "AUGUST":
		case "SEPTEMBER":System.out.println(month + " it's Rainy.");break;
		default:System.out.println("Invalid Input");
		}

	}
}