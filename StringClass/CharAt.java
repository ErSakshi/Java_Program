class CharAt
{
	public static void main(String[] args) 
	{
	  String str=new String("Ramesh");
	  System.out.println(str.charAt(0));  //R
	  
	  System.out.println(str.charAt(str.length()-1));	//H
	  System.out.println(str.charAt(1)); //a
	  System.out.println(str.charAt(-1)); //SIOOB
	}
}