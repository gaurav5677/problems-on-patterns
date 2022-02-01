package ForLoop.CharaterPatterns;

import java.util.Scanner;

public class FormAPatternWithSpecificWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
         String s = sc.nextLine();
         int n = s.length();
         for( int i =1 , p = n ;i<=n ;i++,p--){
             for( int j =1 ; j <i;j++){
                 System.out.print(s.charAt(p) );
             }
             System.out.println();
        }
//give space brefore typing your name or a line
        }
    }

