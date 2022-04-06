package main;

import model.ListaEnlazada;
import model.ListaEnlazadaTail;
import model.Node;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaTail list = new ListaEnlazadaTail();
		
		list.addFirst(new Node(4));
		list.addFirst(new Node(5));
		list.addFirst(new Node(6));
		list.addFirst(new Node(7));
		list.addFirst(new Node(8));

		list.addLast(new Node(3));
		list.addLast(new Node(2));
		list.addLast(new Node(1));
		
		list.print();
		
		Node nodeGoal = list.search(8);
		System.out.println("\n"+nodeGoal.getValue()+"\n");
		
		list.delete(nodeGoal.getValue());
		
		list.print();
	}

}
