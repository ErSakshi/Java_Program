import java.util.*;
class FrequencyOfElement
{
	public static void main(String[] args)
	 {
	    int[]arr={1,2,3,4,1,2,2,3,1,4,5};

	    List<Integer> list=new ArrayList<>();
	    for(Integer i:arr)
	      list.add(i);
	      System.out.println(list);

	      Set<Integer> set=new HashSet<>(list);
	      for(Integer i:set)
	      	 
	      System.out.println(i+":"+Collections.frequency(list,i));	
	}
}