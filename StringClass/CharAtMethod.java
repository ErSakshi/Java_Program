class CharAtMethod
{
	static String str="Ramesh";

	public static void main(String[] args) 
	{
	  	for(int i=0;i<str.length();i++)
	  	{
	  		System.out.print(userCharAt(i)+" ");
	  	}
	}
	public static char userCharAt(int indx)
	{
		if(indx<0||indx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		char []arr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		return arr[indx];
	}
} 