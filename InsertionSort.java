package Algorithmus.SortierAlgorithmus;

public class InsertionSort {

	public static void main(String[] args) {
		// O(n²)
		
		int arr[] = { 3, 1, 4, 8, 2, 3, 5, 7, 1, 3, 8, 97 };
		for (int i = 1;  i < arr.length -1; i++ ) {
			
			int j = i -1;
			int merker = arr[i];
			while(j >= 0 && arr[j] > merker) {
				arr[j +1] = arr[j];
				j -= 1;
			}
			
			arr[j +1] = merker;
		}
		System.out.println("End");
		for (int s : arr)
			System.out.print(s + " ");
	}
}
