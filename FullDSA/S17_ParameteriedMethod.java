package DSA_Series.FullDSA;

public class S17_ParameteriedMethod {
    static int sum(int a , int b ){
        int c = a + b ;
        return c;
    }
    static String greet(String name){
        String word =  "Wellcome" + name;
        return word;
    }
    public static void main(String[] args) {
    //here we calll the method with parameters
      int answer =   sum(20,30);
        System.out.println(answer);

        //String
        String answer2 = greet("sameer");
        System.out.println(answer2);
    }
}
