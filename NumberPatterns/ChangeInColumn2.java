package ForLoop.NumberPatterns;

import java.util.Scanner;

public class ChangeInColumn2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        1 2 3 4 5 6
//          1 2 3 4 5
//            1 2 3 4
//              1 2 3
//                1 2
//                  1
        int n = s.nextInt();
        for ( int i =1 ; i<=n ;i++){
            int p =1;
            for( int j =1 ; j<=i ;j++){
                System.out.print(" ");
            }
            for( int j =i ; j<=n;j++){
                System.out.print(p++);
            }
            System.out.println();
        }



    }
}
