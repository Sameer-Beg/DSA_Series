package DSA_Series.FullDSA;

import java.util.Scanner;

public class S9_LoopsPracticeSet {
    public static void main(String[] args) {
        // Problem 1 . check the largest number and print
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A::");
        int a = sc.nextInt();
        System.out.println("Enter b::");
        int b = sc.nextInt();
        System.out.println("Enter c::");
        int c = sc.nextInt();

        if(a > b && a > c ){
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
