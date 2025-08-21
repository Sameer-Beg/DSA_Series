package DSA_Series.FullDSA;

import java.util.Scanner;

public class S10_Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().trim().charAt(3);
//        System.out.println(ch);

        //program check char is in lower case or uper case
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

    }
}
