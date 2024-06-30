//WAJP to store the factors of a number in a StrinBuffer object and then display it 
//WAJP to store the first 20 fibnocci numbers in a StringBuffer Object
//WAJP to store first 50 prime numbers in a and store in StringBuffer object
import java.util.*;
class Mart
{
	StringBuffer fruits=new StringBuffer();
	Scanner sc=new Scanner(System.in);
	public void addFruits()
	{
       System.out.println("Add Fruits : "); 
       for(int i=0;i<=10;i++)
       {
       	fruits.append(sc.next()+" ");
       }
       System.out.println("================================");
	}   
	public void buyFruits()
	{
		System.out.println("Enter the fruit to Buy : ");
		String buyFruits=sc.next();
		String converted=new String(fruits);
		String arr[]=converted.split(buyFruits);

		System.out.println("========The Cart==========");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("========Thank You=========");
	}                                                                             
	public static void main(String[] args) 
	{
	   Mart m=new Mart();
	   m.addFruits();
	   m.buyFruits();	
	}
}




