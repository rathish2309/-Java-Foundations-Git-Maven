package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample {
    public static void main(String[] args){

        //Hashset

        HashSet<String> strings = new HashSet<>();
        strings.add("Rathish");
        strings.add("Rathish");
        strings.add(null);
        strings.add(null);
        strings.add("Heera");

        System.out.println(strings);


        //LinkedHashset
        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings1.add("Insertion order is maintained");
        strings1.add("Rathish");
        strings1.add("Rathish");
        strings1.add(null);
        strings1.add(null);
        strings1.add("Heera");

        System.out.println(strings1);

        //Treeset
        TreeSet<String> strings2 = new TreeSet<>();
        strings2.add("Sorted order is maintained");
        strings2.add("Rathish");
        strings2.add("Rathish");
//        strings2.add(null);
//        strings2.add(null);
        strings2.add("Heera");
        System.out.println(strings2);


    }
}
