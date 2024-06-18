class Exp1
{
	public static void main(String[] args) 
	{
	   int a=10;
	   int b=0;

       try 
       {
	   System.out.println(a/b);

	 }catch(ArithmeticException e) 
	 {
	 	System.out.println(a/5);
	 	System.out.println("Hii i am try block");
	 }catch(IndexOutOfBoundsException IE)   //we can use multiple catch blocks which is followed by the try block
	 {
	 	System.out.println("AIOBE");
	 }
	}
}