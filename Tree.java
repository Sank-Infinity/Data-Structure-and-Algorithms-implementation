import java.util.Scanner;

class Node{
	
	Node left , right;
	int data ;
	
	public Node(int data) {
		this.data = data;
	}
	
}

public class Tree {

	static Scanner sc = null;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Node root = create();
	
		System.out.print("Inorder Traversal : ");
		Inorder(root);
		
		System.out.print("PreOrder Traversal : ");
		PreOrder(root);
		
		System.out.print("PostOrder Traversal : ");
		PostOrder(root);
		
	}
	
	public static Node create() {
		Node root = null;
		
		System.out.println("Enter Data :");
		int data = sc.nextInt();
		
		if(data==-1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for "+data);
		root.left = create();
		
		System.out.println("Enter right for "+ data);
		root.right = create();
		
		
		return root;
	}
	
	public static void Inorder(Node root) {
		
		if(root == null) return;
		
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
		
	}
	
	public static void PreOrder(Node root) {
		
		if(root == null) return;
		
		System.out.print(root.data + " ");
		PreOrder(root.left);
		PreOrder(root.right);
		
	}
	
	public static void PostOrder(Node root) {
		
		if(root == null) return ;
		
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + " ");
		
	}
	
}



