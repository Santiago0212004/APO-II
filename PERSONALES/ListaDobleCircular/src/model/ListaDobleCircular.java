package model;

public class ListaDobleCircular {
	private Node head;
	
	public void addNode(int value) {
		
		Node node = new Node(value);
		
		
		if(head == null) {
			head = node;
			head.setNext(head);
			head.setPrevious(node);
		} else {
			
			Node tail = head.getPrevious();
			
			node.setNext(head);
			head.setPrevious(node);
			
			tail.setNext(node);
			node.setPrevious(tail);
			
			head = node;
		}
	}
	
	public void setPlayer(int value, String name) {
		setPlayer(head, value, name);
	}
	
	public void setPlayer(Node node, int value, String name) {
		Player addingPlayer = new Player(name);
		
		if(node.getValue()==value) {
			node.setPlayer(addingPlayer);
			return;
		}
		if(node==head.getPrevious()) {
			return;
		}
		
		setPlayer(node.getNext(), value, name);
		
	}
	
	public boolean movePlayer(int originNodeValue, int destinyNodeValue) {
		Node originNode = findPlayerNode(head, originNodeValue);
		return movePlayer(head, originNode, destinyNodeValue);
	}
	
	public boolean movePlayer(Node node, Node originNode, int destinyNodeValue) {
		
		if(originNode!=null) {
			if(node.getValue()==destinyNodeValue) {
				node.setPlayer(originNode.getPlayer());
				originNode.setPlayer(null);
				return true;
			} 
			
			if(node == head.getPrevious()) {
				return false;
			}
			
			return movePlayer(node.getNext(), originNode, destinyNodeValue);
		} else {
			return false;
		}
	}
	
	public Node findPlayerNode(Node node, int originNodeValue) {
		if(node.getValue()==originNodeValue) {
			return node;
		} if(node==head.getPrevious()) {
			return null;
		}
		return findPlayerNode(node.getNext(), originNodeValue);
	}
	
	public void print() {
		print(head);
	}
	
	public void print(Node node) {
		if(node==head.getPrevious()) {
			System.out.println(node.getValue() + ". "+
					(node.getPlayer()!=null?node.getPlayer().getName():""));
			return;
		}
		System.out.println(node.getValue() + ". "+
				(node.getPlayer()!=null?node.getPlayer().getName():""));
		print(node.getNext());
		
	}
}
