class MethodExample
{
	public static void main(String[] args) {
		
        

		System.out.println("Execution Starts ");


        checkPrime(10);

		System.out.println("Execution Ends ");
		
	}
	public static void checkPrime(int num){
		
	      boolean flag=true;

		for(int i =2;i<num;i++){

			if(num%i==0){
				flag=false;
				break;
			}
          
		}
		System.out.println(flag?num+"  is a prime number ":num+" is not a prime number");

	}
}