package DSA_Series.FullDSA;

public class S31_DisplayArrayUsingForLoop {
    public static void main(String[] args) {
//        int[] marks = {20,10,30,40,50,60};
//        for (int i = 0 ; i < marks.length ; i++){
//            System.out.println(marks[i]);
//        }

        //In reverse array
        System.out.println("In reverse order");
        int[] arr = {1,2,3,4,5,6};
        for (int i = arr.length - 1; i >=0 ; i--){
            System.out.println(arr[i]);
        }

        //for each loop
        System.out.println("for each loop");
        int[] a = {34,5,6,76,7};
        for (int element : a){
            System.out.println(element);
        }
    }
}
