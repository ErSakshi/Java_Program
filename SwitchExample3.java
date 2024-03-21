class SwitchExample3
{
	public static void main(String[] args) {
		byte a=1;
		switch(a)
		{
           case 1:System.out.println("HI FROM CASE 1 BLOCK");
		   case 2:System.out.println("HI FROM CASE 2 BLOCK");
		   case 3:System.out.println("HI FROM CASE 3 BLOCK");
		   case 4:System.out.println("HI FROM CASE 4 BLOCK");
		   case 128:System.out.println("HI FROM CASE 5 BLOCK");
		   default:System.out.println("HELLO FROM DEFAULT BLOCK");
		}
	}
}