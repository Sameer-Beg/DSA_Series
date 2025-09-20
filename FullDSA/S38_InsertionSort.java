package DSA_Series.FullDSA;

public class S38_InsertionSort {
    public static void printarr(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,5,3,4,1};
        for (int i = 0 ; i < arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        printarr(arr);
    }

}
