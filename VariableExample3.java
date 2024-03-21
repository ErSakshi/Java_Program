class VariableExample3
{
 public static void main(String []args)
 {
   String a="LOCAL VAR FROM METHOD BLOCK";
   System.out.println(a);
   if(true){
    String b="LV from 1st if block";
    System.out.println(b);
    System.out.println(a);
    }
     if(true){
    int c=10;
   System.out.println(c);
   System.out.println(a);
   //System.out.println(b);
   }
 }
}