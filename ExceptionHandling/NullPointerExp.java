class NullPointerExp
{
	  static Exp p;

	public static void main(String[] args) 
	{
		System.out.println("Main method starts ");

		try{
			System.out.println(p.a);
		}catch(Exception n)
		{
            n.printStackTrace();
		}
		System.out.println("Main method ends");
	}
}
class Exp
{
	int a=420;
}