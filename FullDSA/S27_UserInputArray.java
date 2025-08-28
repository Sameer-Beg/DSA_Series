package DSA_Series.FullDSA;

import java.util.Arrays;
import java.util.Scanner;

public class S27_UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter here");
        int[] n = new int[4];
        for (int i = 0 ; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(n));
    }
}
