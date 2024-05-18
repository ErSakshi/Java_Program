abstract class Parent
{
   public abstract void m1();  
   public abstract void m2();
   public void m3()
   {
   	System.out.println("Hello from parent m3()");
   }
}

abstract class Child1 extends Parent
{
   public void m2()
   {
   	System.out.println("Hello from child m2()");
   }
   public abstract void m4();
}

class SubChild extends Child1
{
   public void m1()
   {
   	System.out.println("Hello from SubChild m1()");
   }
   public void m2()
   {
   	System.out.println("Hello from SubChild m2()");
   }
   public void m4()
   {
   	System.out.println("Hello from SubChild m4()");
   }
   
}

class Child2 extends Parent
{
   public void m1()
   {
   	System.out.println("Hello from Child2 m1()");
   }
   public void m2()
   {
   	System.out.println("Hello from Child m2()");
   }
   public void m5()
   {
   	System.out.println("Hello from Child m5()");
   }
}


class AbstractionDriver
{
	public static void main(String[] args) 
	{
	   SubChild obj= new SubChild();
	   obj.m1();
	   obj.m4();
	   obj.m2();
	   obj.m3();

	   Child2 obj1=new Child2();
	   obj1.m1();
	   obj1.m2();
	   obj1.m5();	
	}
}