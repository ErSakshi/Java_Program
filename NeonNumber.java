class NeonNumber
{
	public static void main(String[] args) {
		int num=9;
		int sqr=num*num;
		int sum=0;

		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr/=10;
		}
		System.out.println(sum==num?num+" is Neon Number":num+" is not a Neon Number");
	}
}