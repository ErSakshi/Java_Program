import java.util.Scanner;
class AdditionOnNumber
{
  public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First String :");
    String a=sc.next();
    sc.nextLine();
    
    System.out.print("Enter Second String :");
    String b=sc.nextLine();
  
    System.out.print("Enter Character : ");
    char ch=sc.next().charAt(4);
    System.out.println("a :"+a);
    System.out.println("b :"+b);
    System.out.println("char is : "+ch);
  }
}
    