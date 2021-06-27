package Tree;

import java.util.*;

public class BinaryTree {
	static Scanner sc=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sc=new Scanner(System.in);
			Node root=createTree();
			inorder(root);
			System.out.println();
			preOrder(root);
			System.out.println();
			postOrder(root);
			System.out.println();
	}
	static Node createTree() {
		Node root=null;
		System.out.println("Enter data: ");
		int data=sc.nextInt();
		if(data==-1) return null;
		root=new Node(data);
		System.out.println("Enter for Left: "+data);
		root.left=createTree();
		System.out.println("Enter for Right: "+data);
		root.right=createTree();
		return root;
	}
	static void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	
	}
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
}

 class Node{
	
	
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
	}
}

