import java.util.*;
class FirstNonRepeatingElement
{
	public static void main(String[] args) 
	{
	  int[]arr={1,2,3,4,2,1,9,8};

	  List<Integer> list=new ArrayList<>();
	   for(Integer i:arr)
	    list.add(i);

	    Set<Integer>set=new HashSet<>(list);
	     int max=Integer.MAX_VALUE;
	     Integer max1=null;
	     for(Integer i:set)
	     {
	      if(Collections.frequency(list,i) < max)
	      {
	      max=Collections.frequency(list,i);
	      max1=i;
	      }
	  }
	  
	  System.out.println(max1);
	 

	}
  
}