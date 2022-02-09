package main;

import java.util.Scanner;

import exception.*;
import model.User;

public class Main {

	public static void main(String[] args) {
		
		int cantidadASacar;
		
		Scanner sc = new Scanner(System.in);
		
		User juan = new User("1231231","Juan Camilo");
		
		System.out.println("Saldo actual: "+juan.getWallet().getPlataDisponible());
		
		while(true) {
			try {
				System.out.println("Escriba la cantidad a sacar: ");
				cantidadASacar = sc.nextInt();
				juan.getWallet().sacarPlata(cantidadASacar);
				System.out.println("\nNuevo saldo: "+juan.getWallet().getPlataDisponible()+"\n");
			} catch (NotEnoughMoneyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(NegativeMoneyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	

}
