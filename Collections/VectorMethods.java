import java.util.*;
class VectorMethods
{
	public static void main(String[] args) 
	{
	   Vector<Integer> list=new Vector<>();
	   
	    for(int i=10;i<=100;i+=10)
	   	list.addElement(i);
	   System.out.println(list); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

	   System.out.println("firstElement : "+list.firstElement()); //10

	   System.out.println("lastElement : "+list.lastElement());//100

	   list.setElementAt(110,3); //sets new element at that index by removing previous
	   System.out.println("setElementAt : "+list);

	   list.removeElementAt(3);
	   System.out.println("removing element : "+list); // [10, 20, 30, 50, 60, 70, 80, 90, 100]

	   list.insertElementAt(111,0);
	   System.out.println( "inserting new element : "+list); // [111, 10, 20, 30, 50, 60, 70, 80, 90, 100]

	   System.out.println(list.removeElement(111)); //true
	   System.out.println("removing the given element "+list); //removing the given element [10, 20, 30, 50, 60, 70, 80, 90, 100]

	   System.out.println("cloning of element : "+list.clone()); //cloning of element : [10, 20, 30, 50, 60, 70, 80, 90, 100]
	   System.out.println(list.toArray()); //[Ljava.lang.Object;@5db250b4
	   System.out.println(list.remove(1)); //20
	   System.out.println(list); //[10, 30, 50, 60, 70, 80, 90, 100]


	}
}