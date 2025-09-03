package DSA_Series.FullDSA;

public class S34_Stringss {
    public static void main(String[] args) {
        //concatenation
        String name1 = "sameer";
        String name2 = "beg";
        String fullname = name1 + name2;
        System.out.println(fullname);

        //.length()
        System.out.println(fullname.length());
        //campare two strings
        if (name1.equals(name2)) {
            System.out.println("same to same ");
        }else {
            System.out.println("No same to same ");
        }

        //substring
        String sentence = "my name is sameer beg";
        String sub = sentence.substring(6,sentence.length());
        System.out.println(sub);

        //parseInt
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //TOString
        int numberrr = 123;
        String strrr = Integer.toString(numberrr);
        System.out.println(str.length());
    }
}
