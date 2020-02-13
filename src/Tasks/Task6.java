package Tasks;

import java.util.Arrays;

//Binary Search
public class Task6 {
	public boolean IntArrayBinarySearch(int[] arr, int value) {

		// sort array
		Arrays.sort(arr);
		// Values
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		boolean result = false;
		
		// Methods
		while (firstIndex <= lastIndex && !result) {
			int middleIndex = (firstIndex + lastIndex)/2;
			if (value == arr[middleIndex])
				result = true;
			else {
				if (value < arr[middleIndex])
					lastIndex = middleIndex-1;
				else
					firstIndex = middleIndex+1;
			}
		}

		return result;
	}
}
