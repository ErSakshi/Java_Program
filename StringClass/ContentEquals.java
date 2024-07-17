class ContentEquals
{
	public static void main(String[] args) 
	{
	   StringBuffer sb1=new StringBuffer("java");	
	   StringBuffer sb2=new StringBuffer("java");
	
	   String s1=new String("java");
	   String s2=new String("java");
	   
	   System.out.println(sb1.equals(s1));//false
	   System.out.println(sb2.equals(s2));//false

	   System.out.println(sb1.equals(sb2));//false
	   System.out.println(s1.equals(s2));//true

	    System.out.println(s1.contentEquals(sb1));//true

	    System.out.println(sb1==sb2);//false
	    System.out.println(s1==s2);//false
	}
}