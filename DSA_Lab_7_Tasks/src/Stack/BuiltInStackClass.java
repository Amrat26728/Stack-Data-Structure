package Stack;

import java.util.Stack;

public class BuiltInStackClass {

	public static void main(String[] args) {
		
		Stack<Object> stack=new Stack<Object>();
		
		stack.add("Amrat");
		stack.add("Noman");
		stack.add("Airaf");
		stack.add("Uzair");
		stack.add("Ahmed");
		stack.insertElementAt("Zohaib", 5);
		System.out.println("Size:"+stack.size());
		System.out.println("Last element: "+stack.lastElement());
		System.out.println("First element: "+stack.firstElement());
		

	}

}
