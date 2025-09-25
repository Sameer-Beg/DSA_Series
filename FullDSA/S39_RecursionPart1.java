package DSA_Series.FullDSA;

public class S39_RecursionPart1 {
//    question 1 method
    public static void printnumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printnumber(n - 1);
    }

//    question 2 method
    public static void printnumb(int n2){
        if(n2 == 6){
            return;
        }
        System.out.println(n2);
        printnumb(n2 + 1);
    }

//    question 3 method
    public static void printnum(int i , int n , int sum ){
        if(i == n){
            sum = sum + i;
            System.out.println(sum );
            return;
        }
        sum = sum + i;
        printnum(i+1 , n , sum);
    }

//    question 4 method
    public static int printfactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * printfactorial(n - 1);
    }

//    question 5 method
    public static int printfibbonaci(int n){
        if(n == 0)
            return 0;

        if(n == 1)
            return 1 ;

        return printfibbonaci(n - 1) + printfibbonaci(n - 2);
    }
    public static void main(String[] args) {

//        print number from 5 -1
        int n = 5 ;
        printnumber(n);

//        print number from 1 - 5
        int n2 = 1;
        printnumb(n2);

//        print sum od n natural number
        System.out.println(printfactorial(5));

//        print factorial of number n
        printfactorial(5);

//        print the fibbonaci sereies
        System.out.println(printfibbonaci(10));
    }
}
