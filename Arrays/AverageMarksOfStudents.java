package arrays;
import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students are passed?");
		int n = sc.nextInt();
		System.out.println("Tell me their marks, I'll tell the total average mark");
		int marks[] = new int[n];
		for(int i= 0; i<n; i++) {     // i stands for index here
			marks[i] = sc.nextInt();
		}
		double averageMarks = 0;
		for(int i =0; i< n; i++) {
			averageMarks += marks[i];
			
		}
		averageMarks /= n;
		System.out.println("The average mark is "+ averageMarks);
		
	}

}
