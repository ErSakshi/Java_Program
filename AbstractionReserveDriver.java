abstract class RBI
{
	abstract void rateOfInterest();
	abstract void widthdrawLimit();
	abstract void depositLimit();
}
abstract class SBI extends RBI 
{
   String userName;
   String accountType;
   SBI(String userName,String accountType)
   {
   	super();
   	this.userName=userName;
   	this.accountType=accountType;
   }
   void displayDetails()
   {
   	System.out.println();
   	System.out.println("Accoutn Holder Name :"+this.userName);
   	System.out.println("Account Type : "+this.accountType);

   }
}
class Saving extends SBI 
{
	Saving(String userName,String accountType)
	{
		super(userName,accountType);
	}
   public void rateOfInterest()
   {
   	System.out.println("Rate of Interest : "+8.5+" %");
   }
   public void widthdrawLimit()
   {
   	System.out.println("Widthdraw Limit : "+50000+" rs.");
   }
   public void depositLimit()
   {
   	System.out.println("Deposit Limit : "+100000 +" rs.");
   }
}
class Current extends SBI 
{
	Current(String userName,String accountType)
	{
		super(userName,accountType);
	}
  public void rateOfInterest()
   {
   	System.out.println("Rate of Interest : "+7.5+" %");
   }
   public void widthdrawLimit()
   {
   	System.out.println("Widthraw Limit : "+500000+" rs.");
   }
   public void depositLimit()
   {
   	System.out.println("Deposit Limit : "+1000000 +" rs.");
   }
}
class AbstractionReserveDriver
{
	public static void main(String[] args) 
	{
	  Saving obj1=new Saving("Ramesh","Saving");
	  obj1.displayDetails();
	  obj1.rateOfInterest();
	  obj1.widthdrawLimit();
	  obj1.depositLimit();


	  Current obj2=new Current("Suresh","Current");
	  obj2.displayDetails();
	  obj2.rateOfInterest();
	  obj2.widthdrawLimit();
	  obj2.depositLimit();
	}
}