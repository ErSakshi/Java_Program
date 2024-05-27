import java.util.*;
class Student
{
	String name;
	String place;
	String branch;

	Student(String name,String place,String branch)
	{
		this.name=name;
		this.place=place;
		this.branch=branch;
	}
	@Override
	public String toString()
	{
		return "Hii my name is "+this.name+" and I belong to "+this.place+" and I completed my "+this.branch;
	}
}
class StudentDriver
{
	public static void main(String[] args) 
	{
		Student obj1=new Student("Ramesh","Pune","Mechanical");
		System.out.println(obj1);
		Student obj2=new Student("Suresh","Pune","Mechanical");
		System.out.println(obj2);
		Student obj3=new Student("Mahesh","Pune","Mechanical");
		System.out.println(obj3);
	}
}