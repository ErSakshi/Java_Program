import java.util.*;
class ArrayAssesment
{
	static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) 
   {
   	System.out.print("Enter the String :");
   	String str=sc.nextLine();

    int cnt=1;
    int i=0;
   
   for(;;)
   {
    String word=" ";
   for(;i<str.length();i++)
   {
    char ch=str.charAt(i);
    if(ch==' ')
    {
       i=i+1;
       cnt++;
        break;
    }
    word +=ch;
   }
   //System.out.println(word);
    if(i==str.length())
       break;
    
    

      String[]words=stringToStringArray(cnt,str);
      System.out.println(Arrays.toString(words));
  }

     public static String[] stringToStringArray(int cnt,String str)
     {
        String[] words=new String[cnt];
        int indx=0;
        int i=0;

        for(;;)
        {
            String word=" ";
            for(;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch==' ')
                {
                    i=i+1;
                    break;
                }
                word +=ch;
            }
            words[indx++]=word;

            if(i==str.length())
                break;
        }
        return words;
     }

   }
