
class Automorphic
{
	public static void main(String[] args) {
		int num=76;
		int dup=num;
		int div=1;
		int sqr=num*num;

		while(num!=0){

			div*=10;
			num/=10;
		}
		int ld=sqr%div;
		System.out.println((dup==ld)?dup+" is a Automorphic":dup+" is not a Automorphic");
	}
}