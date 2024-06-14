import java.util.*;
class FruitStore
{
	  String fruits[];
	static Scanner sc= new Scanner(System.in);

	public void storeFruit(String fruits[])
	{
		this.fruits=fruits;

		for(int i=0;i<fruits.length;i++)
		{
			fruits[i]=sc.next();
		}
	}
	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}

	public void changeFruit()
	{
		System.out.println("Enter the fruit :");
		String inputFruit=sc.next();
		for(int i=0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
               System.out.println("Matches");
               System.out.println("Enter new fruite to update :");
               String newFruit=sc.next();
               fruits[i]=newFruit;
               break;
			}
		}
	}
	public static void main(String[] args)
	 {
	 	

	    FruitStore f=new FruitStore();

	    for(;;)
	    {

        System.out.println("Enter the following option");
        System.out.println("1.Store Fruit");
        System.out.println("2.Dispaly Fruits");
        System.out.println("3.Change Fruit");
        System.out.println("4.Exit");
        int opt=sc.nextInt();


        switch(opt)
        {
        case 1:
        	{
        		System.out.println("Enter the size ");
	          int size=sc.nextInt();

	           System.out.println("Enter the Fruits : ");
	           String fruits[]=new String[size];
               f.storeFruit(fruits);
               break;
            }
        case 2:
        	{
        		if(f.fruits==null)
        		{
                    System.out.println("Please firstly add the fruits to display ");
        		}
        		else {
        			f.displayFruits();
        		}
        		break;
        	}
        case 3:
        	{
        		if(f.fruits==null)
        		{
        			System.out.println("Firstly we have add fruits to make any changes");
        		}
        		else{
        		f.changeFruit();
        	}
        	break;
        	}
        case 4:
        	{
        		System.exit(0);
        	}
        }



	    }
	  	}
}