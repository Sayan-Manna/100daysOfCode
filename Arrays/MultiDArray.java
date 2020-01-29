package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		//int a[][] = new int[5][3];
		//System.out.println(a[2][1]);
		
		/*Multi-Dimentional Array*/
		
		/*int b [][] = {
					{3,1,5,7,2},
					{4,1,7},
					{1,2,3,5,6,8}
					
				    };
		System.out.println(b[0][2]);*/
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	  
	
		

	}

}
