import java.util.*;
class BankApplication
{
	static String name;
	static String address;
	static long phoneNo;
	static long aadharNo;
	static int upiPin;
	static double bal;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		for(; ;){
			System.out.println();
			System.out.println("****Welcome to LaxmiChitFund****");
			System.out.println();
			System.out.println("1.Create Account ");
			System.out.println("2.Existing Account ");
			System.out.println();
			System.out.print("Enter an option : ");
			int option=sc.nextInt();
			System.out.println();

			switch(option)
			{
			  case 1:
			  	{
			  	System.out.println("***Create the Account Module***");
			  	System.out.println();
			  	sc.nextLine();
			  	System.out.print("Enter your name : ");
			  	name=sc.nextLine();
			  	System.out.print("Enter your Address : ");
			  	address=sc.nextLine();
			  	System.out.print("Phone Number : ");
			  	phoneNo=sc.nextLong();
			  	System.out.print("Enter your Aadhar Number :");
			  	aadharNo=sc.nextLong();
			  	System.out.print("Enter Deposit Amount : ");
			  	bal=sc.nextDouble();
			  	System.out.print("Enter Upi Pin : ");
			  	upiPin=sc.nextInt();
			  	System.out.println("Account has been Created Successfully");
			  	break;
			  }
			  case 2:
			  	{
			  		for(; ;)
			  		{
			  			System.out.println();

			  	System.out.println("****Features****");
			  	System.out.println();
			  	System.out.println("1.Check Balance  2.Deposit  3.Withdraw  4.Info 5.Logout");
			  	System.out.print("Enter the Option : ");
			  	int opt=sc.nextInt();

			  	switch(opt)
			  	{
			  	   case 1:
			  	   	{
			  	   		System.out.println("***Check Balance*** ");
			  	   	System.out.print("Enter your upi Pin: ");
			  	   	int userPin=sc.nextInt();
			  	   	  if(userPin==upiPin)
			  	   	  {
			  	   	  	System.out.println("Your current Account Balance is "+bal+" rs");

			  	   	  }else{
			  	   	  	System.out.println("Incorrect upi Pin");

			  	   	  }
			  	}
			  	break;
			  

			        case 2:{
			        	System.out.println();
			        	System.out.println("***Deposit Amount***");
			        	System.out.println();
			        	System.out.print("Enter the Amount : ");
                        double depAmount=sc.nextDouble();
                        bal+=depAmount;
                        System.out.println("Amount Deposited Successfully");
                        
                        break;
			        }
			        case 3:{
			        	System.out.println();
			        	System.out.println("***Withdraw Amount***");
			        	System.out.print("Enter the upi Pin : ");
			        	int password=sc.nextInt();
			        	if(password==upiPin)
			        	{
			        		System.out.print("Enter the Amount : ");
			        		double withdraw=sc.nextDouble();
			        		if(withdraw<=bal)
			        		{
			        			System.out.println("Amount Withdrawn Successfully");
			        			bal=bal-withdraw;
			        			

			        		}
			        		else{
			        			System.out.println("Insufficient Funds ");
			        		}

			        	}
			        	else{
			        		System.out.println("Incorrect Pin");
			        	}
			        	break;

			        }
			         case 4:{
			         	System.out.println();
			         	System.out.println("***Account Info***");
			         	System.out.println();
			         	System.out.println("Account Holder Name : "+name);
			         	System.out.println("Address : "+address);
			         	System.out.println("Phone-Number : "+phoneNo);
			         	System.out.println("Aadhar Number : "+aadharNo);
			         	break;
			         }
			         case 5:{
			         	System.exit(0);
			         }
			         default :System.out.println("Invalid Option ");break;
			  		}
			  	}
			  	


			  }
			   default :System.out.println("Invalid Option");break;
		}
			}
		     
	}
}