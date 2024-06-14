import java.util.*;
class ArrayProgramDriver
{
  int arr[];
  static Scanner sc=new Scanner(System.in);

   public void storeElements(int arr[])
   {
   	   this.arr=arr;
   	  for(int i=0;i<arr.length;i++)
   	 {
   	 	arr[i]=sc.nextInt();
   	 }
   }
    public void findEvenNum(int arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
   	 if(arr[i]%2==0)
   	 {
   	 	System.out.println(arr[i]);
   	 }
    }
   }
   public void findOddNum(int arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
     if(arr[i]%2!=0)
     {
      System.out.println(arr[i]);
     }
    }
   }

   public void findElement(int arr[])
   {

      // System.out.println("Enter the key : ");
      int key=sc.nextInt();
      boolean flag=true;
      int i;
    for( i=0;i<arr.length;i++)
    {
         if(key==arr[i])
         {
          System.out.println("Element found in position : "+(i+1));  // we have to print position not index
           flag=false;
           break;
       }
    }
    if(flag)
    {
      System.out.print("Element is not found");
    } 
   }
   public static void main(String []args)
   {

    ArrayProgramDriver obj=new ArrayProgramDriver();

    for(;;)
    {

    System.out.println("Enter the following option :");
    System.out.println("1.Store the Element");
    System.out.println("2.EvenNumbers");
    System.out.println("3.OddNumbesr");
    System.out.println("4.FindElement");
    System.out.println("5.Exit");
     int opt=sc.nextInt();

     switch(opt)
     {
     case 1:
      {
        System.out.println("Enter the size :");
           int size=sc.nextInt();
           System.out.println("Enter the Elements :");
           int arr[]=new int[size];
            obj.storeElements(arr);
           break;

      }
    case 2:
      {
          System.out.println("The even numbers are :");
          obj.findEvenNum(obj.arr);
          break;
      }
    case 3:
      {
        System.out.println("The odd numbers are :");
         obj.findOddNum(obj.arr);
         break;
      }
    case 4:
      {
          System.out.println("Enter the key :");
          obj.findElement(obj.arr);
          break;
      }
    case 5:
      {
        System.exit(0);
      }
    default :
      {
        System.out.println("Invalid Option");
        break;
      }
     }

      }
    }
}
