class Employee
{
	String name;
	String dept;
	Employee(String name,String dept)
	{
		this.name=name;
		this.dept=dept;
	}
	@Override
	 protected void finalize()  
	{
       System.out.println("Object got Destroyed");
	}
}
class EmployeeDriver
{
	public static void main(String[] args)
	 {
		Employee obj=new Employee("Ramesh","Sales");
		System.out.println(obj.name);
		obj=null;
		System.gc();
		System.out.println(obj.name);
	}
}