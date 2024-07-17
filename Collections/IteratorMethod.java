import java.util.*;
class IteratorMethod
{
	public static void main(String[] args)
	 {
	   ArrayList list=new ArrayList();
       
       for(int i=10;i<=100;i+=10)
       {
       	  list.add(i);
       }
       System.out.println(list);

      Iterator<Integer> ite=list.iterator();

      while(ite.hasNext())
      {
      System.out.println(ite.hasNext());
      	 System.out.println(ite.next());
      }
        ite.remove();
        System.out.println(list);
	}
}
