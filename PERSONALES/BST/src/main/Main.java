package main;

import model.BST;
import model.Node;

public class Main {

	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(new Node(5));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
		tree.insert(new Node(1));
		tree.insert(new Node(2));
		tree.insert(new Node(3));
		
		//tree.inorder();
		//tree.preorder();
		tree.posorder();
	}

}
