package model;

public class ListaEnlazada {
	
	private Node head;
	
	public void addFirst(Node node) {
		//Lista vacía
		if(head == null) {
			head = node;
		}
		//Lista no vacía
		else {
			node.setNext(head);
			head = node;
		}
	}
	
	public void addLast(Node node) {
		addLast(head, node);
	}
	
	private void addLast(Node current, Node node) {
		if(current == null) {
			current = node;
			return;
		} 
		if(current.getNext()==null) {
			current.setNext(node);
			return;
		} 
		addLast(current.getNext(),node);
	}
	
	public void print() {
		print(head);
	}
	
	public void print(Node current) {
		if(current==null) {
			return;
		}

		System.out.println(current.getValue());		
		print(current.getNext());
		
	}
	
}
