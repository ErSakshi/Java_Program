import java.util.*;
class AddAndAddAll
{
	public static void main(String[] args) 
	{
	   Set<Integer> arrayList=new HashSet<Integer>();
	   System.out.println(arrayList.add(10));   //true
	   System.out.println(arrayList.add(null));  //true
	   System.out.println(arrayList.add(null));  //false
	   System.out.println(arrayList.add(null));  //false
	   System.out.println(arrayList.add("10"));

    // System.out.println("==================================================");
	//    Set set=new HashSet();
	//    System.out.println(set.add(10)); //true
    //    System.out.println(set.add(20));  //true
    //    System.out.println(set.add("30")); //true
    //    System.out.println(set.add(30)); //true
    //    System.out.println(set.add(40)); //true
    //    System.out.println(set.add(40)); //false

	}
}