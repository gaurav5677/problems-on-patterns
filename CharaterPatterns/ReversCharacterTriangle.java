package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class ReversCharacterTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for( int i =1 ; i<=n ;i++){
            for( int j =1 ; j<=i;j++){
                char ch = (char)(65+n-i);
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }
    }
}
