package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        for( int i = 1 ,p=65; i<=n ;i++,p++){
            for( int j =1 ;j<=i ;j++){
                System.out.print((char)p);
            }
            System.out.println();
        }
    }
}
