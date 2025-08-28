package DSA_Series.FullDSA;

import java.util.Arrays;
import java.util.Scanner;

public class S29_Modify_ArrayvalueUsingFunctions {
    static void change(int[] arr){
        arr[0] = 9000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here");
        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before change: " + Arrays.toString(arr));
        //cal
        change(arr);

        System.out.println("After change: " + Arrays.toString(arr));
    }
}
