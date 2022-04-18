package main;

import model.ListaDoblePortal;
import model.Node;

public class Main {

	public static void main(String[] args) {
		
		ListaDoblePortal list = new ListaDoblePortal();
		
		list.addFirst(new Node(5));
		list.addFirst(new Node(12));
		list.addFirst(new Node(3));
		list.addFirst(new Node(8));
		list.addFirst(new Node(15));
		
		list.print();
	}

}
