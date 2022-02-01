package ForLoop.NumberPatterns;

import java.util.Scanner;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1 , p=1;
        for (i = 1; i < n; i++,p++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(p);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p);
            }
            System.out.println();
        }

        for ( i = 1; i <= n; i++,p++) {

            //secnond half
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p);
            }
            for (int j = i; j < n; j++) {
                System.out.print(p);
            }
            System.out.println();


        }
    }
}


