package DSA_Series.FullDSA;

public class S22_Varargs {
    static void printNumbers(int ...num){
        for (int n : num){
            System.out.print(n + " ");
        }
        System.out.println( );
    }

    static void printString(String ...msg){
        for (String name : msg){
            System.out.print(name);
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        printNumbers();
        printNumbers(2);
        printNumbers(2,3,4,5);

        printString();
        printString("sameer");
        printString("sam" , "Tan");
    }
}
