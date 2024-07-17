import java.util.*;
class EnsureCapacityMethod
{
	public static void main(String[] args) 
	{
	    ArrayList list=new ArrayList();
	    list.ensureCapacity(15);

	    for(int i=1;i<=15;i++)
	    {
	    	list.add(i);
	    }	
	   System.out.println(list);
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   System.out.println(list);
	  System.out.println(list.size());

	}
}