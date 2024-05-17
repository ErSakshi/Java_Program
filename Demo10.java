class Demo10
{
	String str1="Hi from class Demo10";
	public static void main(String[] args) {
		System.out.println("Hello from main");
		Demo11 obj=new Demo11();
		obj.m1();
	}
}
class Demo11
{
	static Demo10 obj=new Demo10();
	void m1()
	{
		System.out.println("Hi from m1()");
		System.out.println(obj.str1);
		m2();
	} 
	void m2()
	{
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
	static void m3()
	{
		System.out.println("Hii from m3()");
		System.out.println(obj.str1);
	}
}