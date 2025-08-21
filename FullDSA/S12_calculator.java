package DSA_Series.FullDSA;

import java.util.Scanner;

public class S12_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Operator ...");
        int ans = 0;
        while (true){
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the number one ..");
                int num1 = sc.nextInt();
                System.out.println("Enter the number Two..");
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-' ){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans =num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans =num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }else {
                System.out.println("Invalid op");
            }
            System.out.println("The ans is :::" + ans);
        }
    }
}
