package ForLoop.NumberPatterns;

import java.util.Scanner;

public class reverseSameRowElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1, p = n; i <= n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}