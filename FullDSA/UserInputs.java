package DSA_Series.FullDSA;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here . which u can check is even or odd");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("This is Even number");
        }else {
            System.out.println("This is Odd number ");
        }


    }
}
