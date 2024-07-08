import java.util.*;
class CopyingElements
{
	public static void main(String[] args) 
	{
	  List<Integer> list=Arrays.asList(1,2,3,4,5);
	  System.out.println(list);

	  int[]arr={1,2,3,4,5,6,7,8};
	  ArrayList<Integer> arrayList =new ArrayList<>();
	  for(Integer i:arr)
	  	arrayList.add(i);

	  ArrayList<Integer> arrayList1=new ArrayList<>();
	  for(int i=10;i<=200;i+=10)
	  {
         arrayList1.add(i);
	  }
	  System.out.println(arrayList1);
	  
	}
}