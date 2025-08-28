package DSA_Series.FullDSA;

import java.util.Arrays;
import java.util.Scanner;

public class S28_Modify_arrayUsingIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here");

        int[] arr = new int[5];

        for (int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // Here we modify the value  of array  using index
        arr[3] = 120;
        System.out.println(Arrays.toString(arr));
    }
}
