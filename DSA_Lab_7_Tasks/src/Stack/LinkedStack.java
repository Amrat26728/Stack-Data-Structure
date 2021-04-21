package Stack;

public class LinkedStack implements Satck{

	Node top;
	int size;	
	
	
	class Node{
		
		Object data;
		Node next;
		public Node(Object data, Node next) {
			this.data=data;
			this.next=next;
		}
		
	}
	
	
	public void push(Object data) {
		
		top=new Node(data,top);
		size++;
		
	}
	
	
	public Object pop() {
		
		Object object=top.data;
		top=top.next;
		size--;
		return object;
	}
	
	
	public void print() {
		
		System.out.println("Linked Stack elements are: ");
		for(Node n=top;n!=null;n=n.next) 
		{
			System.out.println(n.data);
		}
		
	}
	
	
	public int size() {
		
		return size;
	}
	
	
	public String toString() {
		
		String string="";
		for(Node n=top;n!=null;n=n.next)
		{
			string=string+n.data+" ";
		}
		return string;
	}
	
	
	public Object bottomElement() {
		Node n=top;
		while(n.next!=null)
		{
			n=n.next;
		}
		return n.data;
	}
	
	public Object removeBottomElement() {
		Node n=top;
		Object object=0;
		for(int i=1;i<size-1;i++)
		{
			n=n.next;
		}
		object=n.next.data;
		n.next=n.next.next;
		size--;
		return object;
	}
	
	
	public Object secondElement() {
		Node n=top;
		Object object=0;
		for(int i=1;i<size-2;i++)
		{
			n=n.next;
		}
		object=n.next.data;
		return object;
	}
	
	
	public Object removeSecondElement() {
		
		Node n=top;
		Object object=0;
		for(int i=1;i<size-2;i++)
		{
			n=n.next;
		}
		object=n.next.data;
		n.next=n.next.next;
		size--;
		return object;
	}
	
	
	public void equals(LinkedStack stack) {
		
		boolean check=false;
		if(this.size!=stack.size) System.out.println("Stacks are not equal");
		else
		{
			Node node=stack.top;
			for(Node n=top;n!=null;n=n.next)
			{
				if(n.data==node.data)
				{
					check=true;
				}
				else
				{
					check=false;
					break;
				}
				node=node.next;
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
	
	
	public ArrayStack toArrayStack() {
		int i=this.size;
		ArrayStack arrayStack=new ArrayStack(this.size);
		for(Node n=top;n!=null;n=n.next)
		{
			i--;
			arrayStack.array[i]=n.data;
		}
		return arrayStack;
	}
	
	
	public static void main(String[] args) {
		
		LinkedStack stack=new LinkedStack();
		LinkedStack stack2=new LinkedStack();
		
		stack.push("Amrat");
		stack.push("Noman");
		stack.push("Airaf");
		stack.push("Uzair");
		stack.push("Ahmed");
		stack.push("Arsam");
		stack.print();
		System.out.println("Size: "+stack.size());
		System.out.println("Into string: "+stack.toString());
		
//		System.out.println("Bottom element: "+stack.bottomElement());
//		System.out.println("Bottom element "+stack.removeBottomElement()+" is removed");
//		stack.print();
//		System.out.println("Size: "+stack.size());
//		System.out.println("Into string: "+stack.toString());
		
		
//		System.out.println("Second element: "+stack.secondElement());
//		System.out.println("Second element "+stack.removeSecondElement()+" is removed");
//		stack.print();
//		System.out.println("Size: "+stack.size());
//		System.out.println("Into string: "+stack.toString());
		
//		stack2.push("Amrat");
//		stack2.push("Noman");
//		stack2.push("Airaf");
//		stack2.push("Uzair");
//		stack2.push("Ahmed");
//		stack2.print();
//		System.out.println("Size: "+stack2.size());
//		System.out.println("Into string: "+stack2.toString());
//		
//		stack.equals(stack2);
		
//		ArrayStack arraystack=stack.toArrayStack();
//		System.out.println("toArrayStack elements are:");
//		for(int i=stack.size-1;i>=0;i--)
//		{
//			System.out.println(arraystack.array[i]);
//		}
		
		
	}
	
}
