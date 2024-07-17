import java.util.*;
class EnumerationMethod
{
	public static void main(String[] args) 
	{
	   Vector list=new Vector();
	    list.addElement(10);
	    list.addElement("20");
	    list.addElement(30);
	    list.addElement("40");
	    list.addElement("fifty");
	    list.addElement(60);
	    System.out.println(list);

        Enumeration enumeration=list.elements();
	    Vector<Integer> list2=new Vector<>();	
	    while(enumeration.hasMoreElements())
	    {
	    	Object obj=enumeration.nextElement();
	    	if(obj instanceof Integer)
	    	{
	    		Integer integer=(Integer) obj;
	    	    list2.addElement(integer);
	    }
	   

	    }
	    System.out.println(list2);
	    	}
}