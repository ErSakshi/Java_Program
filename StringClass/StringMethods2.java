class StringMethods2
{
	public static void main(String[] args)
	 {
	    // String str="SAKSHI";
	    // System.out.print(str.toLowerCase());	

	    // String str1="sakshi";
	    // System.out.print(str1.toUpperCase());

	    String str1="sakshi";
	    String str2="siddhi";
	    String str3="  shree@swami@samarth  ";
	    System.out.println(str1.concat(str2));

	    System.out.println(str1.substring(1,6));
	    System.out.println(str2.indexOf('d'));
	    System.out.println(str1.lastIndexOf('s'));
	    
	   System.out.println(str1.codePointBefore(1));
       System.out.println(str3.trim());

	   }
	    
	    }
