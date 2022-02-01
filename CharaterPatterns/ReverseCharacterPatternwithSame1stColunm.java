package ForLoop.CharaterPatterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseCharacterPatternwithSame1stColunm {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1 ; i<=n ;i++){
            for(int j =1 ; j<=i ;j++) {
                System.out.print(" ");
            }
            for( int j =i ; j<=n;j++){
                System.out.print((char)(65+n-j));

            }
            System.out.println();
        }
    }
}
