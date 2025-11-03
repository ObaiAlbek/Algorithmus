package Algorithmus.BinarySearch;

public class BinarySearch {
	/*
	 * - Array soll sortiert werden
	 * 
	 */
	public static void main(String[] args) {
			//indexes: 0,1,2,3,4,5,6,7,8,9
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int low = 0;// 0
		int heigh = array.length -1;//9
		int target = 6;
		
		while(low <= heigh) {
			int mid = (low + heigh) / 2; // 4
			if (array[mid] == target) {
				System.out.println(array[mid]);
				break;
			}
			
			else if(array[mid] < target)
				low = mid + 1;
			
			else if (array[mid] > target)
				heigh = mid - 1;
			
			else
				break;
		}

	}
	
	public static int binarySearch(int[] arr, int target,int low, int height,int mid) {
		if (low <= height) {
			mid = (low + height)/2;
			return binarySearch(arr, target,low, height,mid);
		}
		
		if (arr[mid] == target) 
			return arr[mid];
		
		else if(arr[mid] < target) {
			 low = mid + 1;
			return binarySearch(arr, target,low, height,mid);
		}
		else if (arr[mid] > target) {
			height = mid - 1;
			return binarySearch(arr, target,low, height,mid);
		}
		
		return -1;
		
	}

}
