package DSA_Series.FullDSA;

import java.util.Scanner;

public class S16_Function_Method {
    static  void sum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int n1 = sc.nextInt();
//        System.out.println("Enter number 2");
//        int n2 = sc.nextInt();
//        int bothsum = n1 + n2;
//        System.out.println(bothsum);
    }
    //int
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2");
        int n2 = sc.nextInt();
        int bothsum = n1 + n2;
        return bothsum;
    }
    //String
    static String name(){
        String name = "SAmeer is a good boy";
        return name;
    }
    public static void main(String[] args) {
        //here we direct call the sum bcz of static keyword
//        sum();
//        sum();
//        sum();
//        sum();

        //return value in int
        int answer = sum2();
        System.out.println("THe sum of two numbers is " + answer);


        //return value in String
        String answer2   =  name();
        System.out.println(answer2);


    }
}
