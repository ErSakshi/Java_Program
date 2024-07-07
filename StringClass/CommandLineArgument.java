import java.util.Arrays;
class  CommandLineArgument
{
	public static void main(String[] args) 
	{
	   // int num1=Integer.parseInt(args[0]);
	   // int num2=Integer.parseInt(args[1]);
	   // int add=num1+num2;
	   // System.out.println("Addition is :"+add);	

		String str=args[0];
		String nstr=new StringBuffer(str).reverse().toString();
		System.out.println(str+" "+nstr);

	}
	
}