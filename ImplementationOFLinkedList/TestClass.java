
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList ll = new MyLinkedList();
		
		//Added element in Linked List Successfully!
		for(int i=1; i<=10; i++)
			ll.add(i*5);
		
		//Print Elements which are present in Linked List
		ll.print();
		
		//Set 33 at position 3 based on 0 indexing
		ll.set(3, 33);
		
		System.out.println();
		ll.print();
		
		//Check status of Linked List
		System.out.println();
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
	
		//Remove Element from Linked List from Specific Position
		ll.remove(5);
		ll.print();
		
		//Clear all elements form Linked List
		ll.clear();
		System.out.println();
		ll.print();
	}

}
