class Student
{
	String sName;
	String place;
	String branch;
	int yop;

	Student(String sName,String place,String branch,int yop)
	{
		this.sName=sName;
		this.place=place;
		this.branch=branch;
		this.yop=yop;
	}

	public boolean equals(Object obj)
	{
		Student obj2=(Student)obj;
		if((this.sName==obj2.sName)&&(this.place==obj2.place)&&(this.branch==obj2.branch)&&(this.yop==obj2.yop))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
class StudentDriver1
{
	public static void main(String[] args) 
	{
	   Student obj1=new Student("Ramesh","Pune","CSE",2024);
	   Student obj2=new Student("Ramesh","Pune","Mech",2023);
	   System.out.println(obj1.equals(obj2));	
	}
}