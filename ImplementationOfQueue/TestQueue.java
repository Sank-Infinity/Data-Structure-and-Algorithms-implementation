
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue queue = new MyQueue();
		
		for(int i=1; i<=10; i++) {
			queue.enqueue(i);
		}
		
		//Traverse queue
		queue.print();
		
		//Delete rear element from queue
		System.out.println();
		for(int i=1; i<=5; i++) {
			queue.dequeue();
		}
		
		//Print queue
		queue.print();
		
		//Size of queue
		System.out.println();
		System.out.println(queue.size());
		
		//Clear queue
		queue.clear();
		queue.print();
		
		
		
	}

}
