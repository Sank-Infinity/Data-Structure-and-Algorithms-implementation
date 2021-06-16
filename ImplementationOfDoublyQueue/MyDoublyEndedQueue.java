
public class MyDoublyEndedQueue {

	Node head;
	Node tail;
	
	//Insert an element in deque from tail
	void enqueueLast(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			tail = toAdd;
			return;
		}
		
		Node temp = tail;
		tail.next = toAdd;
		tail = toAdd;
		tail.prev = temp;
	}
	
	//Insert an element in deque from head
	void enqueueFirst(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			tail = toAdd;
			return ;
		}
		
		Node temp= head;
		temp.prev = toAdd;
		head = toAdd;
		head.next = temp;
		
	}
	
	//Check weather queue is empty or not
	boolean isEmpty() {
		return head==null;
	}
	
	//Remove all elements from the queue
	void clear() {
		head = null;
		tail = null;
	}
	
	//Size of Queue
	int size() {
		int size=0;
		if(isEmpty()) {
			return 0;
		}
		
		Node temp = head;
		while(temp!=null) {
			size+=1;
			temp=temp.next;
		}
		
		return size;
	}
	
	//Creating a node
	public class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	//Print Elements in the queue
	void print() {
		
		if(isEmpty()) {
			System.out.println("Deque is Empty!");
			return;
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	//Print elements in the queue in reverse order
	void printReverse() {
		if(isEmpty()) {
			System.out.println("Deque is Empty!");
			return;
		}
		
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
	}
	
}
