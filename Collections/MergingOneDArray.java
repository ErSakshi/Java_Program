import java.util.*;
class MergingOneDArray
{
	public static void main(String[] args) {
		
		// int []a={1,2,3};
		// int[]b={4,5,6};
		// int[]c=new int[(a.length)+(b.length)];

		// int indx=0;
		// for(int i:a)
		// 	c[indx++]=i;

		// for(int i:b)
		// 	c[indx++]=i;

    // System.out.println(Arrays.toString(c));
	
	   int []a={1,2,3};
		int[]b={4,5,6};
		int []d={7,8,9};
		int[]c=new int[(a.length)+(b.length)+(d.length)];

		int indx=0;
		for(int i:a)
			c[indx++]=i;

		for(int i:b)
			c[indx++]=i;
		for(int i:d)
			c[indx++]=i;

       System.out.println(Arrays.toString(c));
	
	}
}