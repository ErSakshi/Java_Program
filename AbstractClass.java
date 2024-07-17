class AbstractClass extends Abstract1
{
	public static void main(String[] args) 
	{
	   	  AbstractClass=new AbstractClass(10);
	}
}
 abstract class Abstract1
 {
 	int a;
 	Abstract1(int a)
 	{
 		this.a=a;
 	}
 }

 //we cannot create object in abstract class
 //constructor is present in abstract class but it cannot be used to invoke members


 //default method in interface is used to give backward compatibility for lambda expression