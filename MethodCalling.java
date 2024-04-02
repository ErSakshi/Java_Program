class MethodCalling
{
   public static void main(String[] args) {
   	
   	System.out.println("Main Starts ");
   	heena();
   	System.out.println("Main Ends ");
   }
   public static void heena()
   {
   	System.out.println("Heena Starts ");
   	 meena();
   	System.out.println("Heena Ends ");
   }
   public static void meena()
   {
   	System.out.println("Meena Starts");
   	seema();
   	System.out.println("Meena Ends");
   }
   public static void seema()
   {
   	System.out.println("Seema Starts" );
   	System.out.println("Seema Ends");
   }
}