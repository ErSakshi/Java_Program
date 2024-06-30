class Kundra
{

	 String gf1;
	   String gf2;
	   String gf3;

	   Kundra(String gf1,String gf2,String gf3)
	   {
	     	this.gf1=gf1;
	     	this.gf2=gf2;
	     	this.gf3=gf3;
	   }
	   Kundra(String gf1)
	   {
	   	this.gf1=gf1;
	   }
	   //overriding equals()
       @Override
	   public  boolean equals(Object obj)
	   {
	   	  Kundra k=(Kundra)obj;
	   	  return this.gf1==k.gf1 && this.gf2==k.gf2 && this.gf3==k.gf3;
	   }

	public static void main(String[] args) 
	{

	  Kundra k1=new Kundra("kanchana","komala","kangana");
	  Kundra k2=new Kundra("kanchana","komala","kangana");

	  Kundra k3=new Kundra("kanchana");
      Kundra k4=new Kundra("kanchana");
     
     System.out.println(k1.equals(k2));
     System.out.println(k3.equals(k4));
      
   }
}