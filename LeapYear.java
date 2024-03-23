import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=sc.nextInt();
	

		  
		  	 // if(year%4==0 ){ 
              
             //  System.out.print("Enter the Number of days : ");
             //   int days=sc.nextInt();
		  	 // 	if(days==366){
		  	 // 		System.out.println(year+" is Leap Year");
		  	 // 	}
		  	 // 	else{
		  	 // 		System.out.println(year+" not a Leap Year");
		  	 // 	}
		  	 // }

		     if(year%400==0 && year%4==0 || year%100!=0){ //leap year=2000,2004,2008,2012
		     	                                          //leap year=2100,2200,2300, not divide by 100
		     	System.out.println(year+" is a Leap Year"); //leapYear can be divided by 4
		     }
		     else{
		     	System.out.println(year+" is not a Leap Year");
		     }

		  }
	}
