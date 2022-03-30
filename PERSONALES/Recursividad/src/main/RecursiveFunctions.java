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
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(2);
		
		System.out.println(sum(numbers,numbers.size()-1));
		System.out.println(prom(numbers));
		
		System.out.println(reverse("hola"));
		
		System.out.println(binarySearch(numbers,2));
		
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
	
	public static int sum(ArrayList<Integer> array, int i) {
		if(i==0) {
			return array.get(i);
		} else {
			return array.get(i) + sum(array,i-1);
		}
	}
	
	public static double prom(ArrayList<Integer> array, int i) {
		if(i==0) {
			return array.get(i)/(double)array.size();
		} else {
			return array.get(i)/(double)array.size() + prom(array,i-1);
		}
	}
	
	public static double prom(ArrayList<Integer> array) {
		return prom(array,array.size()-1);
	}
	
	public static String reverse(String palabra, int i) {
		if(i==0) {
			return palabra.substring(i,i+1);
		} else {
			return palabra.substring(i,i+1) + reverse(palabra,i-1);
		}
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> array){
		int a, b;
		for(int i=0; i<(array.size()-1); i++) {
			for(int j=(i+1); j<array.size() ; j++) {
				a = array.get(i);
				b = array.get(j);
				
				int aux = a;
				
				if(a>b) {
					array.set(i, b);
					array.set(j, aux);
				}
			}
		}
		return array;
	}
	
	public static String reverse(String palabra) {
		return reverse(palabra,palabra.length()-1);
	}
	
	public static int binarySearch(ArrayList<Integer> array, int e, int a, int b) {
		
		array = sort(array);
		
		int mid = (a+b)/2;
		
		if(array.get(mid)==e) {
			return mid;
		} else if(array.get(mid)<e) {
			a = mid + 1;
			return binarySearch(array,e,a,b);
		} else {
			b = mid + 1;
			return binarySearch(array,e,a,b);
		}
	}
	
	public static int binarySearch(ArrayList<Integer> array, int e) {
		return binarySearch(array,e,array.size()-1,0);
	}
}
