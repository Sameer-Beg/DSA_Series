package DSA_Series.FullDSA;

public class S37_SelectionSort {
    public static  void printarr(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,7,8,10,1};
        for (int i = 0 ; i <= arr.length-1 ; i++){
            int smallest = i;
            for (int j = i+1 ; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarr(arr);  //call
    }


}
