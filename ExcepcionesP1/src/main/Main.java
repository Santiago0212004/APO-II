package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
			
				String line1 = sc.nextLine();
				String line2 = sc.nextLine();
			
				int dividendo = Integer.parseInt(line1);
				int divisor = Integer.parseInt(line2);
			
				int resultado = dividendo/divisor;
			
				System.out.println("Resultado: "+resultado);
			
			}catch(NumberFormatException ex) {
				System.out.println("No escribiste un entero");
			}catch(ArithmeticException ex) {
				System.out.println("No se puede dividir entre 0");
			}
		}
	}

}
