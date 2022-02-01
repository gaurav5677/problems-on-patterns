package patterns;
import  java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1 ;
        while(i<=n){
            int j = n ;
            while(j>=i){
                char ch = (char)(64+j);
                System.out.print(ch);
                j = j +1;

            }
            System.out.println();
            i = i +1 ;

        }
    }
}
