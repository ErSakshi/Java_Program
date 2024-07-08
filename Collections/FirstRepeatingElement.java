import java.util.*;
class FirstRepeatingElement
{
	public static void main(String[] args) 
	{
	  List<Integer> list=new ArrayList<>();
	  int []arr={1,2,1,2,3,4};

	    for(Integer i:arr)
	       list.add(i);

	       Set<Integer> set=new HashSet<>(list);
	       int max=0;
	       Integer max1=null;
	       for(Integer i:set)
	       if(Collections.frequency(list,i)>max)
	       {
	       	max=Collections.frequency(list,i);
	       	max1=i;
	       }	
	       System.out.println(max1);
	}
}