package ForLoop.starPatternsUsingForLoops;

import java.util.Scanner;

public class DecreasingTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for( int i=1 ; i<=n ;i++){
            for( int j =i ; j<=n; j++ ){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
