package Stack;

public class ArrayStack implements Satck{

	Object[] array;
	int size;
	
	ArrayStack(int capacity){
		array=new Object[capacity];
	}
			
	
	public void push(Object data) {
		if(size==array.length) resize();
 		array[size]=data;
		size++;
		
	}
	
	
	public Object pop() {
		
		if(size==0) return "Stack is empty!";
		
		else
		{
			Object object=0;
			object = array[size-1];
			array[size-1]=array[size-2];
			size--;
			return object;
		}
	}
	
	
	public void print() {
		System.out.println("Stack elements are: ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
		
	}
	
	public int size() {
		return size;
	}
	
	public void resize() {
		
		Object[] temparr=array;
		array=new Object[2*array.length];
		System.arraycopy(temparr, 0, array, 0, temparr.length);
		
	}
	
	
	public void top() {
		System.out.println("Top element: "+array[size-1]);
	}
	
	
	public String toString() {
		
		String string="";
		for(int i=size-1;i>=0;i--)
		{
			string=string+array[i]+" ";
		}
		return string;
	}
	
	public Object bottomElement() {
		return array[0];
	}
	
	
	public Object removeBottomElement() {
		
		Object object = array[0];
		System.arraycopy(array, 1, array, 0, size-1);
		size--;
		return object;
		
	}
	
	
	public Object secondElement() {
		
		return array[1];
		
	}
	
	
	public Object removeSecondElement() {
		
		Object object=array[1];
		System.arraycopy(array, 2, array, 1, size-2);
		size--;
		return object;
	}
	
	
	public void equals(ArrayStack stack) {
		boolean check=false;
		if(this.size!=stack.size) System.out.println("Stacks are not equal");
		else
		{
			for(int i=0;i<this.size;i++)
			{
				if(array[i]==stack.array[i])
				{
					check=true;
				}
				else
				{
					check=false;
					break;
				}
			}
			
			if(check) 
			{
				System.out.println("Stacks are equal");
			}
			else
			{
				System.out.println("Stacks are not equal");
			}
		}
		
	}
	
	
	public LinkedStack toLinkedStack() {
		
		LinkedStack linkedStack=new LinkedStack();
		for(int i=0;i<this.size;i++)
		{
			linkedStack.push(array[i]);
		}
		return linkedStack;
	}
	
	public static void main(String[] args) {
		
		ArrayStack stack=new ArrayStack(5);
		ArrayStack stack2=new ArrayStack(5);
		stack.push("Amrat");
		stack.push("Noman");
		stack.push("Airaf");
		stack.push("Uzair");
		stack.push("Ahmed");
		stack.print();
		System.out.println("Size: "+stack.size());
//		stack.top();
//		System.out.println("Into String: "+ stack.toString());
//		System.out.println("Bottom element: "+stack.bottomElement());

//		System.out.println("Bottom element "+stack.removeBottomElement()+" is removed");
//		stack.print();
//		System.out.println("Size: "+stack.size());
//		System.out.println("Bottom element: "+stack.bottomElement());
//		System.out.println("Into String: "+ stack.toString());
		
//		System.out.println("Second eleement: "+stack.secondElement());
//		System.out.println("Second element "+stack.removeSecondElement()+" is removed");
//		stack.print();
//		System.out.println("Size: "+stack.size());
		
		
//		stack2.push("Amrat");
//		stack2.push("Noman");
//		stack2.push("Airaf");
//		stack2.push("Uzair");
//		stack2.push("Ahmed");
//		stack2.print();
//		System.out.println("Size: "+stack2.size());
//		
//		stack.equals(stack2);
		
		
		
		LinkedStack linkedstack=stack.toLinkedStack();
		LinkedStack.Node n=linkedstack.top;
		System.out.println("toLinkedStack elements are: ");
		for(int i=0;i<linkedstack.size;i++)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(linkedstack.top.data);
	}

}
