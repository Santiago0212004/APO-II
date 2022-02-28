package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Competitive {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		StringTokenizer tk = new StringTokenizer(reader.readLine());
		
		while(tk.hasMoreElements()) {
			String alfa = tk.nextToken();
			System.out.println(alfa);
		}
	}

}
