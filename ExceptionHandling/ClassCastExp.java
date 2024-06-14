class Parent
{
	public static void m1()
	{
		System.out.println("Hello from Parent 1");
	}
}
class Child extends Parent
{
	public void m1();
	System.out.println("Hello from Child 1");
}


class ClassCastExp
{
	public static void main(String[] args)
	 {
	   	Parent obj=new Parent();
	   	
	   		try 
	   		{
	   		Child obj1=(Child)obj;
	   		obj1.m1();
	   	}
	   	catch(Exception e)
	   	{
            e.printStackTrace();
	   	}
	   	System.out.println("Main Method Ends");
	}
}