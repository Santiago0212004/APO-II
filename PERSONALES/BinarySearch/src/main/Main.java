package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main (String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,-10,1,2,-2,-50,50));
		
		int a, b;
		boolean changed=false;
		for(int i=0; i<numbers.size()-1; i++) {
			a = numbers.get(i);
			for(int j=(i+1); j<numbers.size() && !changed; j++) {
				b = numbers.get(j);
				
				if(a>b) {
					numbers.remove(j);
					numbers.add(i,b);
					changed = true;
					i--;
				}
				
			}
			changed = false;
		}
		
		System.out.println(numbers);
		
		int goal = 50;
		
		Integer pos = find(numbers,goal);
		
		if(pos!=null) {
			System.out.println("El numero "+goal+" está en la posición "+pos+".");
		} else {
			System.out.println("El numero "+goal+" no está en el arreglo.");
		}  
		
			
	}
	
	public static Integer find(ArrayList<Integer> arr, int goal) {
		int i = 0, j = arr.size()-1;
		
		boolean founded = false;
		
		Integer pos = null;
		int mid;
		while(i<=j && !founded) {
			mid = (i+j)/2;

			if(arr.get(mid)==goal) {
				pos = mid;
				founded = true;
			}
			else if(arr.get(mid)>goal) {
				j = mid - 1;
			}
			else if(arr.get(mid)<goal) {
				i = mid + 1;
			}
		}
		
		return pos;
	}
}
