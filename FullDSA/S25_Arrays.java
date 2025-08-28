package DSA_Series.FullDSA;

import java.util.Arrays;
import java.util.Scanner;

public class S25_Arrays {
    public static void main(String[] args) {
        //primitives array
//        old arr
//        int[] arr1 = new int[5];
//        arr1[0] = 90;
//        arr1[1] = 100;
//        arr1[2] = 200;
//        arr1[3] = 900;
//        arr1[4] = 899;
//        System.out.println(arr1[4]);

        //direct
//        int[] arr = {1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[3]);

        //here we print arr using for loop
//        int[] a = {1,2,3,4,5};
//        for (int i = 0 ; i < a.length; i++){
//            System.out.print(a[i] + " ");
//        }

        //objects array
        Scanner sc = new Scanner(System.in);
        String[] name = new String[4];
        for (int i = 0 ; i < name.length ; i++){
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));



    }
}
