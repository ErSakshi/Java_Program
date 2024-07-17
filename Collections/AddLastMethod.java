import java.util.*;
class AddLastMethod
{
	public static void main(String[] args) 
	{
	   LinkedList<Integer> list=new LinkedList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   System.out.println(list);
	  list.addLast(50);
	System.out.println(list);	
	}
}