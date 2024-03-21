class SwitchExample8
{
	public static void main(String[] args) {
		byte a=1;
		switch(a+1)
		{
		    case 1:System.out.println("Hi from case 1 block");break;
		    default:System.out.println("Hello from Default Block");
		    case 'b':System.out.println("Hi from case 3 block");break;
		    case 'c':System.out.println("Hi from case 4 block");break;
		}
	}
}