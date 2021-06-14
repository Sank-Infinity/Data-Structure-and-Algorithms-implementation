import java.util.Stack;

public class MyStack<E> {

	//Head node 
	Node<E> head;
	
	//Create new node
	public class Node<E>{
		E data;
		Node next;
		
		public Node(E data){
			this.data = data;
			next = null;
		}
		
	}

	//Push operation implementation
	void push(E data) {
		Node<E> toAdd = new Node(data);
		
		if(Empty()) {
			head = toAdd;
			return;
		}
		
		toAdd.next = head;
		head = toAdd;
		
		
	}
	
	//This returns the element at top
	E peek() {
		if(Empty()) {
			System.out.println("Stack is Empty!");
			return null ;
		}
		return head.data;
	}
	
	//This function checks stack is empty or not
	boolean Empty() {
		return head==null;
	}
	
	//Remove all elements from stack
	void clear() {
		head = null;
	}
	
	//Traverse Stack using this function
	void traverse() {
		
		if(Empty()) {
			System.out.println("Stack is Empty!");
			return;
		}
		
		Node<E> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	//Pop the element at top
	E pop() {
		
		if(Empty()) {
			System.out.println("Stack is Empty!");
			return null;
		}
		
		E data = head.data;
		head = head.next;
		
		return data;
		
	}
	
	
}
