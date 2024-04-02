class MainMethodCall
{
	public static void main(String[] args) {
		System.out.println("Hii from main() ");
		m1();
		System.out.println("Bye from main() ");
	}
	public static void m1()
	{
		System.out.println("Hii from m1() ");
		String [] persons={"ramesh","suresh"};
		main(persons);
		System.out.println("Bye from m1() ");
	}
}