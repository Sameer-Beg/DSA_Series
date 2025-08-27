package DSA_Series.FullDSA;

import java.util.Scanner;

public class S15_Questions {
    static void age (int n){
        if (n >= 20){
            System.out.println("Drive a car");
        }else {
            System.out.println("No drive a car");
        }
    }

    //prim eor not
    static void isprime(int num){
        if (num % 2 == 0){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       age(n);

       //prime or not
        int num = sc.nextInt();
        isprime(num);

    }
}
