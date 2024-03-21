class SwitchExample4
{
	public static void main(String[] args) {
		byte a=1;
		switch(a+0)
		{
		  case 1:System.out.println("Hi from case 1 block");break;
		  case 2:System.out.println("Hi from case 2 block");break;
		  case 3:System.out.println("Hi from case 3 block");break;
		  case 4:System.out.println("Hi from case 4 block");break;
		  case 128:System.out.println("Hi from case 5 block");break;
		  default:System.out.println("Hello from Default Block");break;
		}
	}
}