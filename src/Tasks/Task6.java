package Tasks;

import java.util.Arrays;

//Binary Search
public class Task6 {
	public boolean IntArrayBinarySearch(int[] arr, int value) {

		// sort array
		Arrays.sort(arr);

		boolean result = false;
		int middleIndex = arr.length/2;

		while (true) {
			if (value == arr[middleIndex])
				result = true;
			else
				while (value != arr[middleIndex]) {
					if (value < arr[middleIndex]) {
						
					}
					else
						break;
				}
			break;
		}

		return result;
	}
}
