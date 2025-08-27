package DSA_Series.FullDSA;

public class S20_Swapnumbercode {
    //Swap using function
    static void swap(int n1 , int n2 ){
        int swap = n1;
        n1 = n2;
        n2 = swap;
        System.out.println("After swap inside method: n1 = " + n1 + ", n2 = " + n2);
    }
    public static void main(String[] args) {
//        int a = 90;
//        int b  = 100;
//        int temp = a ;
//        a = b;
//        b = temp  ;
//        System.out.println("Know a is ::" + a);
//        System.out.println("Know b is ::" + b);

        //call swap
        swap(20,10);
    }
}
