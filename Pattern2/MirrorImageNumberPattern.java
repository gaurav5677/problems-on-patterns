package Pattern2;

import java.util.Scanner;

public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j =1;
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces=spaces+1;
            }
            while ( j<=i){
                System.out.print(j);
                j +=1;

            }
            System.out.println( );
            i +=1;

        }





    }
}
