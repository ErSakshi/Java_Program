interface Arithmetic
{
	int add(int a,int b);
	int multi(int a,int b);
}
class Solution implements Arithmetic
{
	public int add(int a,int b)
	{
		System.out.println("Addition is : "+(a+b));
		return (a+b);
	}
	public int multi(int a,int b)
	{
		System.out.println("Multiplication is : "+(a*b));
		return (a*b);
	}
}
class InterfaceDriver
{
	public static void main(String[] args) 
	{
	  Solution obj=new Solution();	
	  obj.add(20,10);
	  obj.multi(20,10);
	}
}