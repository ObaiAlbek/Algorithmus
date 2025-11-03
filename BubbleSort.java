package Algorithmus.SortierAlgorithmus;

public class BubbleSort {

	public static void main(String[] args) {
		// O(n²)
		
		int arr[] = { 3, 1, 4, 8, 2, 3, 5, 7, 1, 3, 8, 97 };

		for (int i = 0; i < arr.length ; i++) 
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		System.out.println("End");
		for (int s : arr)
			System.out.print(s + " ");
	}
}
