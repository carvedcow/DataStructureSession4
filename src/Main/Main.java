package Main;

import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;
import Tasks.Task5;
import Tasks.Task6;

public class Main {
	public static void main(String[] args) {

		// TASK 1 -----------------------------------------------------------
		// Given String[][], if "purple" then "yellow" 
		System.out.println("Task 1 ------------------------------------------");
		// Values
		String[][] colorArray = {{"red", "orange", "purple"}, {"green", "blue", "indigo"}};
		Task1 task1 = new Task1();

		// Methods
		System.out.println("--- Before Change ---");
		for (int i = 0; i < colorArray.length; i++) {
			for (int j = 0; j < colorArray[i].length; j++)
				System.out.println("Array [" + i + "][" + j + "]: " + colorArray[i][j]);
		}

		task1.purpleToYellow(colorArray, "purple", "yellow");

		System.out.println("--- After Change ---");
		for (int i = 0; i < colorArray.length; i++) {
			for (int j = 0; j < colorArray[i].length; j++)
				System.out.println("Array [" + i + "][" + j + "]: " + colorArray[i][j]);
		}

		System.out.println("------------------------------------------");
		System.out.println();


		// TASK 2 -----------------------------------------------------------
		// Write a program to find how many correct answer 
		// each student had in a multiple choice quiz
		// (All Students Answers) char[][] = {{},{}}
		// (Single Student Answers)
		// (Correct Answers) char[] keys = {A, C, D, B, A}

		System.out.println("Task 2 ------------------------------------------");


		// Values
		char [][] ClassAnswers = {
			{'A', 'C', 'D', 'B', 'A'},
			{'A', 'A', 'A', 'A', 'A'},
			{'A', 'C', 'D', 'B', 'B'}};
		char[] Answers = {'A', 'C', 'D', 'B', 'A'};
		Task2 task2 = new Task2();

		// Methods
		System.out.println("--- Class Answers ---");
		for (int i = 0; i < ClassAnswers.length; i++) {
			for (int j = 0; j < ClassAnswers[i].length; j++)
				System.out.println("Student [" + i + "] Answer[" + j + "]: " + ClassAnswers[i][j]);
		}

		System.out.println("--- Class Grades ---");

		int[] Grades = task2.CalculateAllStudentsGrades(ClassAnswers, Answers);
		for (int i = 0; i < Grades.length; i++) {
			System.out.println("Student #"+ i + "'s Grade: " + Grades[i] + "/" + task2.getTotalQuestionCount(Answers));
		}
		

		System.out.println("------------------------------------------");
		System.out.println();

		// TASK 3 -----------------------------------------------------------
		System.out.println("Task 3 ------------------------------------------");
		int[] task3Array = new int[] {2, 5, 6, 1, 22, 7};
		Task3 task3 = new Task3();
		task3.IntArrayBubbleSort(task3Array);
		for (int i = 0; i < task3Array.length; i++) {
			System.out.println(task3Array[i]);
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		// TASK 4 -----------------------------------------------------------
		System.out.println("Task 4 ------------------------------------------");
		int[] task4Array = new int[] {3, 4, 5, 1, 23, 6};
		Task4 task4 = new Task4();
		task4.IntArraySelectionSort(task4Array);
		for (int i = 0; i < task4Array.length; i++) {
			System.out.println(task4Array[i]);
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		// TASK 5 -----------------------------------------------------------
		System.out.println("Task 5 ------------------------------------------");
		int[] task5Array = new int[] {5, 4, 67, 7, 1, 4};
		Task5 task5 = new Task5();
		task5.IntArrayInsertionSort(task5Array);
		for (int i = 0; i < task5Array.length; i++) {
			System.out.println(task5Array[i]);
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		// TASK 6 -----------------------------------------------------------
		System.out.println("Task 6 ------------------------------------------");
		int[] task6Array = new int[] {5, 4, 67, 7, 1, 4};
		Task6 task6 = new Task6();
		System.out.println("------------------------------------------");
		System.out.println();
	}
}
