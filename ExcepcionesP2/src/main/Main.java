package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Pedir fecha del sistema
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd / MMMM / yyyy");
		
		String formattedDate = sdf.format(date);
		
		System.out.print(formattedDate);
		
		Scanner sc = new Scanner(System.in);
		String dateInString = sc.nextLine();
		
		try {
			Date inputDate = sdf.parse(dateInString);
		} catch (ParseException e) {
			System.out.println("Fecha mal escrita");
		}

	}

}
