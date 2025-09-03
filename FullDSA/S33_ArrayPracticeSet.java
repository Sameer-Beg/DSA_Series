package DSA_Series.FullDSA;

public class S33_ArrayPracticeSet {
    public static void main(String[] args) {
        //problem 1 . crete a array of 5 floats and calculate there sum
       /* float[] arr = {20.3f , 40.5f , 30.5f, 60.32f, 21.3f};
        float sum = 0;
        for (float element : arr){
            sum = sum + element;
        }
        System.out.println("The ssum of array is " + sum
        );*/

//        problem 2 . array value is prent in array or not
       /* int[] arr = {3,4,6,77,8,9};
        int num  = 77;
        boolean isinArry = false;
        for (int element : arr){
            if (num == element){
                isinArry = true;
                break;
            }
        }
        if (isinArry){
            System.out.println("Yes value is prent on the arr");
        }else {
            System.out.println("No no value is prent on the array");
        }*/

//        problem 3 . calculate the average of marks prent in the arry
       /* double[]  marks = {30.4, 50.5, 43.5, 23.4, 44.5};
        double sum = 0;
        for (double element : marks){
            sum = sum + element;
        }
        System.out.println("The average of the marks is " + sum/marks.length);*/

//        problem 4 . reverse an arry
        /*int[] arr = {1,2,3,4,5,65};
        for (int i = arr.length-1 ;  i >= 0 ; i--){
            System.out.println(arr[i]);
        }*/

//        add two matrix  of an arry
       /* int[][] mat1 = {{1,2,3},
                        {4,5,6}   };
        int[][] mat2 = { {1,2,3},
                          {4,5,6}};
        int[][] result = {
                {0,0,0},
                {0,0,0}};
        for (int i = 0; i < mat1.length ; i++){
            for (int j = 0 ; j<mat1[i].length; j++){

                result[i][j]  = mat1[i][j] + mat2[i][j];
            }

        }
        for (int i = 0; i < mat1.length ; i++){
            for (int j = 0 ; j<mat1[i].length; j++){
                System.out.print(result[i][j]+ " ");
                result[i][j]  = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }*/

//        find our maxmiun element of an array
        /*int[] arr = {5, 8, 12, 3, 9, 15, 1};
        int max = arr[0]; // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);*/

//        minimun array elelmnt
       /* int[] arr = {3,4,5,61,1};
        int min = arr[0];
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);*/

//        Array is sorted or not
        boolean isSorted = true;
        int[] arr = {1,2,3,4,5};
        for (int i = 0 ;  i < arr.length-1 ; i++){
            if (arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Yes this arry is sorted ");
        }else {
            System.out.println("No this array is not sorted");
        }


    }
}
