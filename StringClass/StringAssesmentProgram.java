import java.util.*;
class StringAssesmentProgram
{
	static String str;
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the String : ");
	  String str=sc.next();	
	  int len=str.length();
	  // String fh=((new StringBuffer(str.substring(0,(len/2)))).reverse()).toString();
	  // String sh=((new StringBuffer(str.substring((len/2),len))).reverse()).toString();
	  // System.out.print(fh+" , "+sh);

	  // String op="";
	  // for(int i=0;i<sh.length();i++)
	  // {
	  // 	if(i<fh.length())
	  // 		op=op+fh.charAt(i);
	  // 	op=op+sh.charAt(i);
	  // }
	  // System.out.println(op);
	  String fh=len/2;
	  String sh=str-fh;
	  String op=userString(fh,sh);


     }
     public static String userString(String fh,String sh)
     {
     	String op="";
     	for(int i=0;i<sh.length();i++)
     	{
     		for(int j=0;j<sh.length();j++)
     		{
               if(i<sh.length())
               	op=op+fh.charAt(i);
               op=op+sh.charAt(j);
     		}
     	}
     	System.out.print(op);
     }

}
