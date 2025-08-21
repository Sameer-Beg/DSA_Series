package DSA_Series.FullDSA;

import java.util.Scanner;

public class S11_fibonnacciii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //fibonacci
//        System.out.print("Enter number of terms: ");
//        int n = sc.nextInt();
//
//        int first = 0, second = 1;
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(first + " ");
//            int next = first + second;
//            first = second;
//            second = next;
//        }

        //reverse the program
        int num = sc.nextInt();
        for (int i = num; i>=0 ; i--){
            System.out.println(i);
        }
    }
}
