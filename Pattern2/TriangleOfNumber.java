package Pattern2;

import java.util.Scanner;

public class TriangleOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i  =1 ;
        while( i<=n){
            int spa = 1 ;
            while(spa <= (n-i)){
                System.out.print(" ");
                spa = spa + 1;

            }
            int j = 1;
            int val = i;
            while( j<=i){
                System.out.print(val+"");
                val = val + 1;
                j = j + 1;

            }
            j= 1;
            val =( 2* i - 2);
            while( val>= i ){
                System.out.print(val+"");
                val = val-1;
                j= j-1;
            }
            System.out.println();
            i= i + 1;
        }
    }
}
