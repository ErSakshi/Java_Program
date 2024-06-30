import java.util.*;
class Assesment98
{
	public static void main(String[] args) 
	{
	// 	Scanner sc=new Scanner(System.in);
	   // System.out.println("Enter the Number of chapters");
	   // int size=sc.nextInt();
	   // System.out.println("Enter the starting day of leave");
	   // int b=sc.nextInt();
	   // System.out.println("Enter the ending day of leave");
       // int e=sc.nextInt();

	   // int []arr=new int[e+1];
       // int chapterCount=1;
     
     
	   // for(int i=0;i<e+1;i++)
	   // {
	   // 	arr[i]=sc.nextInt();
	   // 	chapterCount++;
	   // }
	   
       // System.out.println(Arrays.toString(arr));
    
	     int chapters=4;
	     int start=3;
	     int end=5;

	     int uniqChapters=solve1(chapters,start,end);
	     System.out.println(uniqChapters);
	     int uniqChapters1=solve(chapters,start,end);
	     System.out.println(uniqChapters1);

	}
	private static int solve1(int chapters,int start,int end)
	{
		if((end-start)>=chapters)
			return chapters;
		else 
			return (end-start)+1;
	}

	private static int solve(int chapters,int start,int end)
	{
		int a=chapters*((end/chapters)+1);
		int []chapters1=new int[a];
		int indx=0;
		for(int j=1;j<=(a/chapters);j++)
		{
			for(int i=0;i<chapters;i++)
			{
				chapters1[indx++]=i;
			}
		}
		int[]arr=new int[end-start+1];

		for(int i=start,j=0;i<=end;i++,j++)
		{
			arr[j]=chapters1[i];
		}
		long cnt=Arrays.stream(arr).distinct().count();
		return (int) cnt;
	}
}