package Tasks;

public class Task4 {
	// selection sort
	// sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning
	// 13 11 1 8 7 5
	// 1 13 11 8 7 5
	// 1 5 13 11 8 7
	public int[] IntArraySelectionSort(int[] arr) {


		for (int i = 0; i < arr.length-1; i++) {
			int min = i;

			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j; 
					}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;


		}
		return arr;
	}
}
