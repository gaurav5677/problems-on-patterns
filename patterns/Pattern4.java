package patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1 ;
        while( i<=n){
            int j =1 ;
            while (j<=i){
                char ch = (char)(65+n-i);
                System.out.print((char)(ch + j -1));

                j=j+1;
            }
            System.out.println();
            i =i+1;
        }
    }
}
