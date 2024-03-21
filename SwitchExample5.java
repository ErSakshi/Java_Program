class SwitchExample5
{
	public static void main(String[] args) {
		int a=1;
		switch(a+0)
		{
		case 1:System.out.println("Hi from case 1 block");break;
		case 2:System.out.println("Hi from case 2 block");break;
		case 'A':System.out.println("Hi from case 3 block");break;
		case 65:System.out.println("Hi from case 4 block");break;
		case 128:System.out.println("Hi from case 5 block");break;
		default:System.out.println("Hello from Default Block");break;
		}
	}
}