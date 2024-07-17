import java.util.*;
class TrimToSizeMethod
{
	public static void main(String[] args)
	 {
	   ArrayList list=new ArrayList();
	   list.ensureCapacity(50);

	   for(int i=1;i<=20;i++)
	   {
	   	list.add(i);
	   }
	   list.trimToSize();	
	   System.out.println(list);
	   list.add(10);
	   System.out.println(list);

	}
}