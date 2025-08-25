package DSA_Series.FullDSA;

import java.util.Scanner;

public class S14_Switch {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("king of the fruits");
//                break;
//            case "Banana":
//                System.out.println("Very Healthy fruit");
//                break;
//            case "papaya":
//                System.out.println("Best for stomach");
//                break;
//            default:
//                System.out.println("Unvalid Fruit");
//        }

//        print days
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the number of the day..");
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesdy");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        switch (name){
            case "sameer":
                System.out.println("Good boy");
                break;
            case "Tanverr":
                System.out.println("Sameer ka bhai");
                break;
            case "Subhan":
                System.out.println("Tanverr ka bhai");
                break;
            case "Farhan":
                System.out.println("Subhan ka bhai");
                break;
            default:
                System.out.println("Kisa ka bhai nhi h ");
        }

    }
}
