package Tasks;

public class Task3 {
	// Bubble Sort
	public int[] IntArrayBubbleSort(int[] arr) {
		 
        for (int i = 0; i < arr.length-1; i++) 
            for (int j = 0; j < arr.length-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
		
		return arr;
	}
}
