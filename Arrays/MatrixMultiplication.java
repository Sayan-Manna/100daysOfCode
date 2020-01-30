package arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the no. of rows in mat1");
		int r1 = sc.nextInt();
		System.out.println("enter the no. of cols in mat1");
		int c1 = sc.nextInt();
		System.out.println("Enter the no. of rows in mat2");
		int r2 = sc.nextInt();
		System.out.println("Enter the no. of cols in mat2");
		int c2 = sc.nextInt();
		
		if(c1==r2) {
			int mat1[][] = new int[r1][c1];
			int mat2[][] = new int[r2][c2];
			int res[][] = new int[r1][c2];
			System.out.println("Enter the elements of mat1");
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c1; j++) {
					mat1[i][j] = sc.nextInt();
				}
				
			}
			System.out.println("Enter the elements of mat2");
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c1; j++) {
					mat2[i][j] = sc.nextInt();
				}
				
			}
			
			
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c2; j++) {
					res[i][j] = mat1[i][j]*mat2[i][j];
				}
				
			}
			System.out.println("Result array res is: ");
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c2; j++) {
					System.out.print(res[i][j]+" ");
				}
			System.out.println();
				
			}
			
		}
		

	}

}
