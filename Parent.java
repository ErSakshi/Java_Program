interface Parent
{
	int a=20;
	void m1();
  default void m2()
  	{
  		System.out.println("Hello from m2()");
  	}
  	public static void m3()
  	{
  		System.out.println("Hello from m3()");
  	}
}
interface Child extends Parent 
{

}
class Imp implements Child
{
	public void m1()
	{
		System.out.println("The value of static final variable a : "+a);
		System.out.println("Hello from child m1()");
	}
	public static void main(String[] args) {
		Imp obj=new Imp();
		obj.m1();
		obj.m2();

		
	}
}