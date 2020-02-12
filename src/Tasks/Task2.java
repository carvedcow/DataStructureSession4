package Tasks;

public class Task2 {
	// Write a program to find how many correct answer 
	// each student had in a multiple choice quiz
	// (All Students Answers) char[][] = {{},{}}
	// (Single Student Answers)
	// (Correct Answers) char[] keys = {A, C, D, B, A, A, B}
	
	public int getTotalQuestionCount (char[] correctAnswers) {
		return correctAnswers.length;
	}
	
	public int CalculateStudentGrade(char[] givenAnswers, char[] correctAnswers) {
		int result = 0;
		
		for (int i = 0; i < givenAnswers.length ; i++) {
			if (givenAnswers[i] == correctAnswers[i]) {
				result++;
			}
		}
		
		return result;
	}
	
	public int[] CalculateAllStudentsGrades(char[][] studentsAnswers, char[] correctAnswer) {
		
		int[] classGrade = new int[studentsAnswers.length];
		
		for (int i = 0; i < studentsAnswers.length; i++) {
			for (int j = 0; j < studentsAnswers[i].length; j++) {
				classGrade[i] = CalculateStudentGrade(studentsAnswers[i], correctAnswer);
			}
		}
		return classGrade;
	}
	
}
