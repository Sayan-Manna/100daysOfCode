package hackerRank;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            a[i] = val;


        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
