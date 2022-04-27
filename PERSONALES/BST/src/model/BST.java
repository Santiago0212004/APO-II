package model;

public class BST {
	private Node root;
	
	public void insert(Node node) {
		insert(root, node);
	}
	
	private void insert(Node current, Node node) {
		if(root == null) {
			root = node;
		} else {
			if(node.getValue() < current.getValue()) {
				if(current.getLeft()==null) {
					current.setLeft(node);
				} else {
					insert(current.getLeft(), node);
				}
			} else if(node.getValue() > current.getValue()) {
				if(current.getRight()==null) {
					current.setRight(node);
				} else {
					insert(current.getRight(), node);
				}
			}
		}
	}
	
	public void inorder() {
		inorder(root);
	}
	
	public void inorder(Node current) {
		
		if(current == null) {
			return;
		}
		
		inorder(current.getLeft());
		System.out.println(current.getValue());
		inorder(current.getRight());
	}
	
	public void preorder() {
		preorder(root);
	}
	
	public void preorder(Node current) {
		
		if(current == null) {
			return;
		}
		
		System.out.println(current.getValue());
		preorder(current.getLeft());
		preorder(current.getRight());
	}
	
	public void posorder() {
		posorder(root);
	}
	
	public void posorder(Node current) {
		
		if(current == null) {
			return;
		}
		
		posorder(current.getLeft());
		posorder(current.getRight());
		System.out.println(current.getValue());
	}
	
	
	
}
