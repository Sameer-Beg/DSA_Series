package DSA_Series.FullDSA;

import java.util.Scanner;

public class S6_PracticeSet1 {
    public static void main(String[] args) {
//        Take two numbers and print the sum of both.
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b ;
//        System.out.println(sum);

//        Take a number as input and print the multiplication table for it.
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 0 ; i <= 10 ; i++){
//            System.out.println(num*i);
//        }


//        Input a year and find whether it is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year: " + year);
        } else {
            System.out.println("This is not a leap year: " + year);
        }

    }
}
