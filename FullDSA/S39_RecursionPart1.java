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

    public static void main(String[] args) {
//        print number from 5 -1
        int n = 5 ;
        printnumber(n);

//        print number from 1 - 5
        int n2 = 1;
        printnumb(n2);

//        print sum od n natural number
        printnum(1,5,0);

    }
}
