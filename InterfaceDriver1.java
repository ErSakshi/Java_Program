//Example of multiple Inheritence in interface 
interface Parent1
{
	void m1();
 default void m4()
 	{
 		System.out.println("Hii");
 	}
}
interface Parent2
{
	void m2();
}
interface Child extends Parent1,Parent2
{
	void m3();
}
class Solution implements Child
{
	public void m1()
	{
		System.out.println("Implimentation from m1()");
	}
	public void m2()
	{
		System.out.println("Implimentation from m2()");
	}
	public void m3()
	{
		System.out.println("Implimentation from m3()");
	}
}
class InterfaceDriver1
{
	public static void main(String[] args) 
	{
	  Solution obj=new Solution();
	  obj.m1();
	  obj.m2();
	  obj.m3();	
	  obj.m4();   // inherits method from parent1
	}
}