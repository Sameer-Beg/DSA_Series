package DSA_Series.FullDSA;

public class S23_AdditionUsingVarargs {
    static int add(int ...n){
        int sum = 0 ;
        for (int num : n){
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Sum (no args) = " + add());                  // 0
        System.out.println("Sum (2 args) = " + add(10, 20));             // 30
        System.out.println("Sum (5 args) = " + add(1, 2, 3, 4, 5));      // 15
        System.out.println("Sum (mixed) = " + add(100, 200, 300, 400));
        System.out.println(add(3000,50000));

    }
}
