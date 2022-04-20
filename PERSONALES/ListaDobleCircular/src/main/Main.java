package main;

import model.ListaDobleCircular;

public class Main {

	public static void main(String[] args) {
		ListaDobleCircular list = new ListaDobleCircular();
		
		list.addNode(5);
		list.addNode(12);
		list.addNode(3);
		list.addNode(8);
		list.addNode(15);
		
		list.setPlayer(12, "Santiago");
		
		list.print();
		
		System.out.println("");
		
		boolean moved = list.movePlayer(15, 8);
		
		if(moved) {
			list.print();
		} else {
			System.out.println("No se movio el jugador");
		}
		
		

	}

}
