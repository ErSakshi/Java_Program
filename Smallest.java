class Smallest
{
	public static void main(String[] args) {
		int num1=5;
		int num2=4;
		int num3=6;
		System.out.println((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3)));
	}
}