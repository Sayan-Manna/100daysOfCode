package loops;
import java.util.Scanner;
public class FibonacciNum {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		/*int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i = 0; i<n-2; i++){
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}*/
		
//		 int maxNumber = 0; 
//		 int previousNumber = 0;
//		 int nextNumber = 1;
//		 
//		    System.out.println("How many numbers you want in Fibonacci:");
//	        Scanner sc = new Scanner(System.in);
//	        maxNumber = sc.nextInt();
//	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
//
//	        for (int i = 1; i <= maxNumber; ++i)
//	        {
//	            System.out.print(previousNumber+" "); 
//	            /* On each iteration, we are assigning second number
//	             * to the first number and assigning the sum of last two
//	             * numbers to the second number
//	             */
//
//	      
//	            int sum = previousNumber + nextNumber;
//	            previousNumber = nextNumber;
//	            nextNumber = sum;
//	        }	 
		
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
	
	

	}

}
