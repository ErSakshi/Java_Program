abstract class Arithmatic
{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int multiplication(int num1,int num2);
	abstract int division(int num1,int num2);
	abstract int modulus(int num1,int num2);
}
class ArithmeticImplementation extends Arithmatic
{
	public int addition(int num1,int num2)
	{
		System.out.println(num1+num2);
		return num1+num2;
	}
	public int substraction(int num1,int num2)
	{
		System.out.println(num1-num2);
		return num1-num2;
	}
	public int multiplication(int num1,int num2)
	{
		System.out.println(num1*num2);
		return num1*num2;
	}
	public int division(int num1,int num2)
	{
		System.out.println(num1/num2);
		return num1/num2;
	}
	public int modulus(int num1,int num2)
	{
		System.out.println(num1%num2);
		return num1%num2;
	}
}
class AbstractionExample1
{
	public static void main(String[] args) 
	{
	   ArithmeticImplementation obj=new ArithmeticImplementation();
	   obj.addition(2,4);
	   obj.substraction(2,4);
	   obj.multiplication(2,4);
	   obj.division(2,4);
	   obj.modulus(2,4);	
	}
}