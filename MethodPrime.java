class MethodPrime
{
	public static void main(String[] args) {
		for(int i=2;i<=20;i++){
			isPrime(i);
		}
	}
	public static void isPrime(int num){
		boolean flag=true;
		for(int i=2;i<num;i++){
			
		if(num%2==0){
			flag=false;
			break;
		}

		}if(flag){
			System.out.print(num+" - is Prime   ");

		}else{
			System.out.print(num+" -is not Prime  ");
		}
		
	}
}