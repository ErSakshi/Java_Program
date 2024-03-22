class PatternProgram
{
	public static void main(String[] args) {
		 int num=0;
		 
		 for(int i=1;i<=5;i++){
           num =num+i;        
             
		 	     
               for(int j=1;j<=i;j++){
		         System.out.print(num--+" ");

		 		}
		 		num=num+i;
		 		System.out.println();
		 	  
		 	  
		 	  
		 }
	}
}