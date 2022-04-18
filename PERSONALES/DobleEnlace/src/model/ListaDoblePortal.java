package model;

public class ListaDoblePortal {
	private Node head;
	private Node tail;
	
	public void addFirst(Node node) {
		if(head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
	}
	
	public void addLast(Node node) {
		if(tail == null) {
			tail = node;
			head = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
	}
	
	private void print(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.getValue());
		print(node.getPrev());
	}
	
	public void print() {
		print(tail);
	}
	
	public void delete(int value) {
		delete(head, value);
	}
	
	private void delete(Node current, int value) {
		
		if(current == null) {
			return;
		}
		
		if(value == head.getValue() && current.equals(head)) {
			head.getNext().setPrev(null);
			head = current.getNext();
			return;
		}
		
		if(value == tail.getValue() && current.equals(tail)) {
			tail.getPrev().setNext(null);
			tail = current.getPrev();
			return;
		}
		
		if(current.getValue()==value) {
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			return;
		}
		delete(current.getNext(),value);
	}
}
