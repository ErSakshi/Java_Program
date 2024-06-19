class StringMethods
{
	public static void main(String[] args) 
	{
	   String name1="karthik";
	   String name2="kanchana";
	   String name3="komala";
	   String name4="";
	   String name5=" ";
	   String s="Qspiders";

	   String convertedCaps=name1.toUpperCase();  //KARTHIK
	    System.out.println(convertedCaps);

	   int length=name3.length(); //6
       System.out.println(length);
   
	   char singleCharacter=name1.charAt(2);//r
       System.out.println(singleCharacter);

	   String mergedNames=name1.concat(name2).concat(name3);//karthikkanchana
        System.out.println(mergedNames);

	   String multipleChars=name2.substring(5,8);//ana
        System.out.println( multipleChars);

	   String singleChar=name3.substring(0,1);//k
        System.out.println(singleChar);

	   boolean emptyOrNot=name4.isEmpty();//true
	   boolean emptyOrNot1=name5.isEmpty();//false  //space has some memory
        System.out.println(emptyOrNot);
        System.out.println(emptyOrNot1);

        String replaced=s.replace('Q','J');//Jspiders
        System.out.println("Replaced from "+s+" to "+replaced);

	  
	   
	   
	   
	  
	  
	  
	  
	}
}