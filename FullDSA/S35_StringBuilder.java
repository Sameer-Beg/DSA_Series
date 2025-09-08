package DSA_Series.FullDSA;

public class S35_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("Sameer");
        System.out.println(sb
        );
        //char AT
        System.out.println(sb.charAt(0));
        //replace ,
        sb.setCharAt(0 , 'T');
        System.out.println(sb);

        //delete
        sb.delete(1,2);
        System.out.println(sb);

        //append
        sb.append("sam");
        System.out.println(sb);


        //question . reverse a string
        String str = "Hello World";
        String reversed = "";
        // Loop through string from last char to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);

    }
}
