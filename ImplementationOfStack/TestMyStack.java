
public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack<String> stack = new MyStack<>();
		stack.peek();
		stack.pop();
		for(int i=1; i<=10 ;i++)
			stack.push("123");
		
//		stack.traverse();
		String data = stack.pop();
//		System.out.println(data);
		stack.pop();
		stack.pop();
		stack.traverse();
		stack.clear();
		stack.pop();
		System.out.println(stack.peek());
	}

}
