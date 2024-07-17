import java.util.*;
class RemoveFirstOccurrence
{
	public static void main(String[] args) 
	{
	   LinkedList<Integer> list=new LinkedList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(10);
	   list.add(40);
	   list.add(10);
	   System.out.println(list);
	   
	   System.out.println(list.removeFirstOccurrence(10));
	   System.out.println(list);
	   System.out.println(list.removeLastOccurrence(50));
	    System.out.println(list.removeLastOccurrence(10));
	   System.out.println(list);
	}
}