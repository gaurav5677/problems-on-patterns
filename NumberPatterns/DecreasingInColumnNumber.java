package ForLoop.NumberPatterns;

import java.util.Scanner;

public class DecreasingInColumnNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = n;
            for (int j = 1; j <= i; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}

