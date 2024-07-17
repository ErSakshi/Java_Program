class StringAndStringBuffer
{
	public static void main(String[] args) 
	{
	   String s1="java";
	   String s2="java";

	   if(s1==s2)
	   System.out.println("true");	


	String str1=new String("java");
	String str2=new String("java");

	System.out.println(str1==str2);

		 StringBuffer str3=new StringBuffer("python");
		StringBuffer str4=new StringBuffer("python");  //false 

		System.out.println(str3==str4);

		int a=4;
		int b=4;
		System.out.println(a==b);
	}
}
//when we compare two string objects or stringbuffer objects using '==' operator 
//it alwalys returns false bcoz it compares refrence object and even if data is same

//but in primitive datatype '==' compares the data
//we cannot override equals() in predefined class
