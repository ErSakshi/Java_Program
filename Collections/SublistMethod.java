import java.util.*;
class SublistMethod
{
	public static void main(String[] args) 
	{
	  ArrayList<Integer> arrayList = new ArrayList<>();

	  arrayList.add(10);
	  arrayList.add(30);
	  arrayList.add(50);
	  arrayList.add(40);
	  arrayList.add(20);

	  System.out.println("Original array list : "+arrayList);
	  Collections.sort(arrayList);
	  System.out.println("Sorted array list "+arrayList);	

	  List arrayList1=arrayList.subList(2,5);
	  System.out.println("Sublist : "+arrayList1);
	}
}