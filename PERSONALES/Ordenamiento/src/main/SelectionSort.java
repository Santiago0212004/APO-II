package main;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {-80,10,22,40,-2,-4};
		
		int a, b;
		
		

		for(int i=0; i<(arr.length-1); i++) {
			for(int j=(i+1); j<arr.length ; j++) {
				a = arr[i];
				b = arr[j];
				
				if(a>b) {
					arr[i] = b;
					arr[j] = a;
				}
			}
		}
		
		String arrString = "[";
		
		for(int i=0; i<arr.length; i++) {
			if(i!=arr.length-1) {
				arrString += arr[i]+",";
			}
			else {
				arrString += arr[i];
			}
			
		}
		
		arrString += "]";
		
		System.out.println(arrString);
	}

}
