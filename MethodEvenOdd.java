class MethodEvenOdd
{
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			isEvenOdd(i);
		}
	}
	public static void isEvenOdd(int num)
	{
		if(num%2==0){
			System.out.println(num+" -Even ");
		}else{
			System.out.println(num+" -Odd ");
		}
	}
}