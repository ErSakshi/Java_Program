import java.util.Scanner;
class ArrayPrgm1
{
    static Scanner sc=new Scanner(System.in);
    int arr[];

    public void storeElements(int arr[])   //used to only store elements 
    {
       this.arr=arr;

       for(int i=0;i<arr.length;i++)
       {
       	arr[i]=sc.nextInt();
       }
    }

    public void displayElements() //used to only display elements
    {
    	for(int i:arr)
    	{
    		System.out.print(i+" ");
    	}
    }



	public static void main(String[] args)
	 {
		 System.out.println("Enter the Size :");
		 int size=sc.nextInt();

		 System.out.print("Enter Array Elements : ");
		 int arr[]=new int[size];

		 ArrayPrgm1 p1=new ArrayPrgm1();
		 p1.storeElements(arr);
		 p1.displayElements();
	}
}