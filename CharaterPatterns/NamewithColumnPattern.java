package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class NamewithColumnPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc = "CODER";
        int n = sc.length();
        for (int i =1 ; i<=n ;i++){
            int p = 0 ;
            for( int j =1 ; j<=i;j++){
                System.out.print(sc.charAt(p++));
            }
            System.out.println();
        }
    }
}
