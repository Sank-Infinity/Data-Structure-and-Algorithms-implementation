
public class MyQueue {

	Node head;
	Node tail;
	
	//Creating a node
		public class Node{
			
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				next = null;
			}
			
		}
	
	//Insert element in queue
	void enqueue(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			tail = toAdd;
			return;
		}
		
		tail.next = toAdd;
		tail = toAdd;
	
	}
	
	//Check queue is empty or not
	boolean isEmpty() {
		return head==null;
	}
	
	int size() {
		int size=0;
		
		Node temp = head;
		while(temp!=null) {
			size +=1;
			temp = temp.next;
		}
		
		return size;
	}
	
	//Dequeue the element from the queue
	void dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		
		if(size()==1) {
			head=null;
			tail=null;
			return;
		}
		
//		System.out.println(tail.data);
		
		head = head.next;
		
		

	}
	
	void clear() {
		head = null;
		tail = null;
		return;
	}
	
	//Traverse the queue
	void print() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
	}
	
}
