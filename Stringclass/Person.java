class Person
{
	public static void main(String[] args) 
	{
	   String girlFriend="";
	   String wife="cindrella ";

	   
	   if(girlFriend.isEmpty())
	   {
         try{
         	   throw new GirlfriendException ("He is not having girlFriend");
          }catch(Exception e)
         {
         	e.printStackTrace();
         	if(wife.isEmpty())
         	{
         		System.out.println("He is not having wife");
         	}else 
         	{
         		System.out.println("Wife name "+wife);
         	}
         }
	   }
	}
}
class GirlfriendException extends Exception
{
	String message;
	GirlfriendException(String message)
	{
		super(message);
	}
}