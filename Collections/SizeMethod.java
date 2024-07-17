import java.util.*;
class SizeMethod
{
	public static void main(String[] args) 
	{
	    // Collection<Integer> coll=new ArrayList<>();
        //  coll.add(10);
        //  System.out.println(coll.size());
        //  coll.add(20);
        //  coll.add(30);
        //  coll.add(40);
        //  System.out.println(coll.size());

        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        System.out.println(list); 

        Integer arr[]=new Integer[list.size()];
        for(int i=0;i<list.size();i++)
        {
        	arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
	}
}