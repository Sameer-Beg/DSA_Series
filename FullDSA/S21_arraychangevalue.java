package DSA_Series.FullDSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S21_arraychangevalue {
    static void change(int[] nums){
        nums[0] = 90;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
