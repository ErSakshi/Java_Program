import java.util.*;
class AddMethod
{
	public static void main(String[] args) 
	{
	   ArrayList arrayList=new ArrayList();
	   arrayList.add(40);
	   arrayList.add(50);
	   arrayList.add(60);


	   Collection collection=new ArrayList();
	   System.out.println(collection);
	   collection.add(10);
	   collection.add(20);
	   collection.add(30);
	   System.out.println(collection);
	   collection.addAll(arrayList);
	   System.out.println(collection);	
	}
}