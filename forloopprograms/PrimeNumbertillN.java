package ForLoop;

import java.util.Scanner;

public class PrimeNumbertillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        Method 1

//        for( int i = 2; i<=n  ; i++){
//            boolean isPrime = true;
//            for( int j = 2 ; j <= i ; j++){
//                if( i % j ==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println(i);
//            }
//        }

        //method 2
        for (int i = 2; i <= n; i++) {
            int count = 0;


            // try to divide i and increment count
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);


            }


        }
    }
}