package main;

import java.util.Scanner;

public class ZeroError {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,division;
		
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			division = a/b;
			System.out.println("\nLa división es: "+division+"\n");
		}catch (ArithmeticException e) {
			System.out.println("\nNo se puede dividir entre cero\n");
		}

	}

}
