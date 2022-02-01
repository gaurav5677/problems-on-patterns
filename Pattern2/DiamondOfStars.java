package Pattern2;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int fistHalf = (n + 1) / 2;
        int secondHalf = n / 2;

        //First half
        int i = 1;
        while (i <= fistHalf) {
            int spa = 1;
            while (spa <= (fistHalf - i)) {
                System.out.print(" ");
                spa = spa + 1;
            }
            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j = j + 1;

            }
            System.out.println();
            i = i + 1;
        }
        //secondHalf
         i = secondHalf;

        while( i >=1){
            int spa =1;
            while(spa <=secondHalf - i+1){
                System.out.print(" ");
                spa = spa+1;

            }
            int j=1;
            while (j<=(2*i)-1){
                System.out.print("*");
                j = j+1;
            }

            System.out.println();
            i= i-1;
        }









    }





}