package DSA_Series.FullDSA;

import java.util.Scanner;

public class S8_Loops {
    public static void main(String[] args) {
        /*
        The syntax of For loop
        for(initialization ; condition ; increment/decrement){
                //body
            }
         */
//        program print 1 to 100
//        for (int i =  0 ; i<=100 ; i++){
//            System.out.println(i);
//        }

//        Print number from 1 to n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//        for (int num = 0; num < n; num++) {
//            System.out.println(num);
//        }

        /*
        While Loop Syntax
        While(condition){
          //body
        }
         */
//        print 1 to 10
//        int n = 1;
//        while (n <= 10){
//            System.out.println(n);
//            n++;
//        }

        /*
        Do while loop syntax
        do{
            //body
            }while(condition)
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while (n <= 10);
    }
}
