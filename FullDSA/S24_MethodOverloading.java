package DSA_Series.FullDSA;

public class S24_MethodOverloading {

    //Method overloading means we have two method same names but deffrent parameters

    //Method1
    static int sum (int a , int b){
        int c = a + b ;
        return c;
    }
    //Method2
    static int sum(int a , int b , int c){
        int d = a + b + c ;
        return d;
    }
    public static void main(String[] args) {
  int ans =    sum(20,30);
        System.out.println(ans);

    int ans2 = sum(20,30,30);
        System.out.println(ans2);
    }
}
