import java.util.*;
class AddMethodOfList
{
	public static void main(String[] args) 
	{
	  List<String> list= Arrays.asList("ramesh","mahesh","suresh","ganesh");



	  String[]arr=new String[list.size()];
	  for(int i=0;i<list.size();i++)
	  {
	  	arr[i]=list.get(i);
	  }
	  System.out.println(list);

	  list.add("mukesh");
	  list.add("paresh");
	  System.out.println(list);

	}
}