//write a java program to merge two arrays into one single array
import java.util.*;
class MergingArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Array1 size : ");
		int size1=sc.nextInt();
		int []arr1=new int[size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the Array2 size : ");
		int size2=sc.nextInt();
        int []arr2=new int[size2];
        for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}


		int mergedArrSize=size1+size2;
		int []mergedArr=new int[mergedArrSize];

		
		
         
		for(int i=0;i<size1;i++)
		{
			mergedArr[i]=arr1[i];
		}
		for(int i=0;i<size2;i++)
		{
			mergedArr[size1+i]=arr2[i];
		}
		System.out.println("First Array : "+Arrays.toString(arr1));
		System.out.println("Second Array :"+Arrays.toString(arr2));
		System.out.println(" Merged Array :"+Arrays.toString(mergedArr));
	}
}