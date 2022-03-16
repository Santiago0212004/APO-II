package main;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-80,10,22,40,-2,-4};
	
		int a, b;
		
		

		for(int i=0; i<(arr.length-i); i++) {
			for(int j=0; j<(arr.length-i-1) ; j++) {
				a = arr[j];
				b = arr[j+1];
				
				if(b<a) {
					arr[j] = b;
					arr[j+1] = a;
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
