class SwitchExample6
{
	public static void main(String[] args) {
		byte a=1;
		switch(a+0)
		{
		case 1:System.out.println("Hi from case 1 block");break;
		case 'b':System.out.println("Hi from case 2 block");break;
        case "B":System.out.println("Hi from case 3 block");break;
        default:System.out.println("Default Block");break;.
		}
	}
}