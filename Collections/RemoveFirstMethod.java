import java.util.*;
class RemoveFirstMethod
{
	public static void main(String[] args) 
	{
	   LinkedList<Integer> list=new LinkedList<>();

	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   System.out.println(list);
	   System.out.println(list.removeFirst());	
	   System.out.println(list);
	}
}