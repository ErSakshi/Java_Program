import java.util.*;
class RepeatingElement
{
	public static void main(String[] args) 
	{
	  int[]arr={1,2,1,2,3,4,5};

	  List<Integer> list=new ArrayList<>();
	  for(Integer i:arr)
	    list.add(i);
	System.out.println(list);

	Set<Integer>set=new LinkedHashSet<>(list);
	  for(Integer i:set)
	  {	
	  if(Collections.frequency(list,i)>1)
	  System.out.println(i+" is repeating");
	
       }

	}
}