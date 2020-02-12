package Tasks;

// Given String[][], if "purple" then "yellow" 
// String[][] arr = {{"red", "orange", "purple"}, {"green", "blue", "indigo"}};
public class Task1 {
	public String[][] purpleToYellow(String[][] arr, String from, String to) {

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j].equals(from))
					arr[i][j] = to + " (changed)";
			}
			
		}	
		return arr;
	}
	
}
