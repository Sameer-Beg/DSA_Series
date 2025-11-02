package DSA_Series.FullDSA;

public class S44_MergeSort {

    // Conquer (merge two sorted parts)
    public static void Conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];

        int indx1 = si;      // left part
        int indx2 = mid + 1; // right part
        int x = 0;

        // Merge both parts
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merge[x++] = arr[indx1++];
            } else {
                merge[x++] = arr[indx2++];
            }
        }

        // Copy remaining left part
        while (indx1 <= mid) {
            merge[x++] = arr[indx1++];
        }

        // Copy remaining right part
        while (indx2 <= ei) {
            merge[x++] = arr[indx2++];
        }

        // Copy merged elements back to original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    // Divide
    public static void devide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        devide(arr, si, mid);      // left half
        devide(arr, mid + 1, ei);  // right half
        Conquer(arr, si, mid, ei); // merge
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 1, 3, 5};
        int n = arr.length;

        devide(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
