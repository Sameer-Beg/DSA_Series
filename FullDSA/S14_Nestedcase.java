package DSA_Series.FullDSA;

import java.util.Scanner;

public class S14_Nestedcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String name = sc.nextLine();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println(",,,,,");
                switch (name){
                    case "sam":
                        System.out.println("sameer monday ko gya tha");
                        break;
                    case "Tan":
                        System.out.println("Tanverr k pass");
                        break;
                    default:
                        System.out.println("No name is entered ");
                }
            default:
                System.out.println("Invalid day");
        }
    }
}
