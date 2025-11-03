package DSA_Series.FullDSA;
import java.util.ArrayList;
import java.util.*;
public class S45_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();

        // add
        list.add(2);
        list.add(0);
        list.add(32);
        System.out.println(list);

        // get
        int element = list.get(2);
        System.out.println(element);

        // add elemnt in btwn
        list.add(0,90);
        System.out.println(list);

        // set element
        list.set(0,33);
        System.out.println(list);

        // delete elelemnt
        list.remove(0);
        System.out.println(list);

        // size
        int s = list.size();
        System.out.println(s);

        //loop
        System.out.println("all elements prent in the list print nhere line by line ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        // collection
        Collections.sort(list);

        System.out.println(list);
    }
}
