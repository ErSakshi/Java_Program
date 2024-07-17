import java.util.*;
class StackMethods
{
	public static void main(String[] args) 
	{
	  Stack<Integer> stack=new Stack<>();

	  for(int i=40;i>=0;i-=10)
	  {
	  	stack.push(i);
	  }	
	  System.out.println(stack);
	  stack.push(110);
	  System.out.println(stack);
	  System.out.println(stack.pop());
	  System.out.println(stack.peek());
	  System.out.println(stack.empty());
	  System.out.println(stack.search(40));

	}
}