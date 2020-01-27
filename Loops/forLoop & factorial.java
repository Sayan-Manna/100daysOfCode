package loops;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//for(int x = 0; x<=5; x++) {
			//System.out.println("Great");
			
		//for(int y = 0; y<=10; y+=2) {
			//System.out.println(y);
		//for(int i =2; i<17;i=i*i) {
			//System.out.println(i);
		
		//Finding Factorial of a Number
		
		Scanner sc = new Scanner(System.in);
		
	/*	int factorial = 1;
		for(int i = n; i>=1; i--) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		

	} */
		
		int i,fact=1;
		int n = sc.nextInt();
		for(i=1; i<=n; ++i) {
			fact =fact*i;
			//System.out.println(i);
			
		}
		System.out.println(fact);
	}	

}
