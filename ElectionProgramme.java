import java.util.Scanner;
class ElectionProgramme
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("You are able to vote");
			System.out.print("Do you have voter id (yes/no) :");
			String voterId=sc.next().toLowerCase();
			 if(voterId.equals("yes")){
			 	System.out.println("********WelCome*********");

    		   System.out.println("1. BJP ");
    		   System.out.println("2. CONGRESS ");
    		   System.out.println("3. AAP ");
    		   System.out.println("4.MNS ");
    		   System.out.println("5.ShivSena");
    		   System.out.println("6.NCP ");
    		   System.out.println("7.NOTA ");

    		   System.out.print("Enter the option to vote for your party : ");
    	       String vote=sc.next().toUpperCase();

    	       if(vote.equals("BJP")){
    			System.out.println("You have voted for BJP ");
    		}
    		else if(vote.equals("CONGRESS")){
    			System.out.println("You have voted for CONGRESS ");
    		}
    		else if(vote.equals("AAP")){
    			System.out.println("You have voted for AAP ");
    		}
    		else if(vote.equals("MNS")){
    			System.out.println("You have voted for MNS ");
    		}
    		else if(vote.equals("ShivSena")){
    			System.out.println("You have voted for ShivSena ");
    		}
    		else if(vote.equals("NCP")){
    			System.out.println("You have voted for NCP ");
    		}
    		else if(vote.equals("NOTA")){
    			System.out.println("Thanks for wasting your one vote ");
    		}
    		else{
    			System.out.println("Invalid Option");
    		}

			 }
		
			}else{
				System.out.println("You are not eligible for voting try after "+(18-age)+" years");
			}

		
	}
}