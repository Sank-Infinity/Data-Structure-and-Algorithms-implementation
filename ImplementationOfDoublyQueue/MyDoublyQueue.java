
public class MyDoublyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDoublyEndedQueue deque = new MyDoublyEndedQueue();
		
		for(int i=0; i<10; i+=3) {
			deque.enqueueFirst(i);
			deque.enqueueLast(i+3);
		}

		
		deque.print();
		System.out.println();
		deque.printReverse();
		System.out.println();
		System.out.println(deque.size());
		deque.clear();
		deque.printReverse();
		deque.print();
		System.out.println(deque.size());

		
	}

}
