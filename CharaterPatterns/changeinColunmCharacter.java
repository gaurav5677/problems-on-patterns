package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class changeinColunmCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i =1 ; i<=n ; i++){
            for( int j =1 ; j<=i; j++){
                System.out.print((char)(65+j-1));
            }
            System.out.println();
        }
    }
}
