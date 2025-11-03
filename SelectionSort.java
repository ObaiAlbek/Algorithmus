package Algorithmus.SortierAlgorithmus;

public class SelectionSort {
	// O(n²)

	public static void main(String[] args) {
		int arr[] = {3,4,1,23,5,19,2,8,9};
		for (int i = 0; i < arr.length -1; i++) {
			
			int minIndex = i;
			for (int j = i +1; j < arr.length;j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		for (int s : arr)
			System.out.print(s + " ");
		
	}

}
