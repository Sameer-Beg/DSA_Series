package DSA_Series.FullDSA;

public class S41_Recursion_Problem_ReverseString {
    public static void Printrivstring(String str , int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        Printrivstring(str  , index
         - 1);
    }
    public static void main(String[] args) {
    String  str = "abcd";
    Printrivstring(str , str.length()-1);

    }
}
