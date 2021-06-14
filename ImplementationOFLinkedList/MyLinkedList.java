
public class MyLinkedList {

	//Head Node
	Node head;
	
	//Create Node which holds data and reference of next node
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	//Add element in LL
	void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return ;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
		
	}
	
	//get element from specific position
	int get(int j) {
		
		try {
			if(isEmpty()) {
				System.out.println("Empty LinkedList");
				System.exit(0);
			}
			
			Node temp = head;
			int i = 1;
			while(i< j) {
				temp = temp.next;
				i+=1;
			}
			System.out.println();
			return(temp.data);
			
		}catch(Exception e) {
			System.out.println("Index is inValid!");
		}
		return 0;
	}
	
	//Set element at specific position
	void set(int index, int data) {
	
		try {
			
			Node toSet = new Node(data);
			
			if(isEmpty()) {
				if(index==0) {
					head = toSet;
					toSet.data = data;
					System.exit(0);
				}
				System.out.println("Empty LinkedList");
				System.exit(0);
			}
			if(index==0) {
				toSet.next = head;
				head = toSet;
				return ;
			}
			
			Node temp = head;
			int i=0;
			while(i<index-1) {
				temp = temp.next;
				i+=1;
			}
			
			Node jump = null;
			toSet.next  = temp.next;
			temp.next = toSet;
			
			
		}catch(Exception e) {
			System.out.println("Invalid Index!");
		}
		
	}
	
	
	//Print all elements present in the linked List 
	void print() {
		
		if(isEmpty()) {
			System.out.println("LinkedList is Empty!");
			return ;
		}
		
		Node temp = head;	
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next ;
		}
		
	}
	
	void clear() {
		head = null;
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	int size() {
		int size=0;
		if(isEmpty())
			return size;
		
		Node temp = head;
		while(temp != null) {
			size+=1;
			temp=temp.next;
		}
		
		return size;
	}
	
	//Remove particular element from specific position
	void remove(int index) {
		
		if(isEmpty()) {
			System.out.println("Empty LinkedList");
			return;
		}
		
		if(index == 0) {
			
			Node temp = head;
			head = temp.next;
			
			return;
		}
		
		Node temp = head;
		int i = 0;
		while(i<index-1) {
			temp = temp.next;
			i+=1;
		}
		Node dump = temp.next;
		temp.next = dump.next;
	}

}
