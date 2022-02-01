package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class reversnamePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String k = s.nextLine();
        int n = k.length();
        for (int i = 1, p = n; i <= n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k.charAt(p) + " ");
            }
            System.out.println();
        }
    }
}
