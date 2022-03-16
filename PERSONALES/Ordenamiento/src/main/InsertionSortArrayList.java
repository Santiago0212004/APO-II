package main;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,-10,1,2,-2,-50,50));
		
		int a, b;
		boolean changed=false;
		for(int i=0; i<arr.size()-1; i++) {
			a = arr.get(i);
			for(int j=(i+1); j<arr.size() && !changed; j++) {
				b = arr.get(j);
				
				if(a>b) {
					arr.remove(j);
					arr.add(i,b);
					changed = true;
					i--;
				}
				
			}
			changed = false;
		}
		
		System.out.println(arr);
		
	}

}
