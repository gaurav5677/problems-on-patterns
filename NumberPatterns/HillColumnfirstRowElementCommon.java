package ForLoop.NumberPatterns;

import java.util.Scanner;

public class HillColumnfirstRowElementCommon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for ( int i =1 ; i<=n ;i++){
            int p =1 ;
            for( int j =i ; j<=n;j++){
                System.out.print(" ");
            }
            for( int j =1 ;j<=2*i-1;j++){
                System.out.print(p++);
            }
            System.out.println();
        }
    }
}
