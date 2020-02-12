package Tasks;


// 5, 4, 67, 7, 1, 4
// 4, 5, 67, 7, 1, 4
// 4, 5, 67, 7, 1, 4
// 4, 5, 7, 67, 1, 4
// 1, 4, 5, 7, 67, 4
// 1, 4, 4, 5, 7, 67
public class Task5 {
	public int[] IntArrayInsertionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i]; 
            int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key;
			
		}
		
		return arr;
	}
}
