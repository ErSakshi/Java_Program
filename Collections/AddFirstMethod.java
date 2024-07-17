import java.util.*;
class AddFirstMethod
{
	public static void main(String[] args) 
	{
	  LinkedList<Integer> list=new LinkedList<>();

	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   System.out.println(list);
	   list.addFirst(50);
	   System.out.println();	
	   System.out.println(list);		
	}
}