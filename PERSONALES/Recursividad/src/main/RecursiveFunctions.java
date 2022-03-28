package main;

import java.util.ArrayList;

public class RecursiveFunctions {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(fibonacci(5));
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Juan");
		names.add("Daniel");
		names.add("David");
		names.add("Sebastian");
		names.add("Santiago");
		names.add("Carlos");
		names.add("Camilo");
		names.add("George");
		
		System.out.println(printArrayRecursive(names,names.size()-1));
	}
	
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
	
	public static int fibonacci(int num) {
		if(num == 0) {
			return 1;
		} else if(num==1){
			return 1;
		} else { 
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
	
	public static String printArrayRecursive(ArrayList<String> array, int i) {
		
		if(i==0) {
			return array.get(i);
		}
		
		System.out.println(printArrayRecursive(array,i-1));
		return array.get(i);
	}
	
}
