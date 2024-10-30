package in.CollectionAndGenerics;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Golu"));
        System.out.println(names.add("Tripathi"));
        System.out.println(names.add("JavaCourse"));
        Utility.print(names);

        System.out.println(names.add("Golu"));

        System.out.println(names.size());

        Utility.print(names );

        System.out.println(names.contains("Golu"));

        System.out.println(names.remove("Golu"));

        Utility.print(names);

        System.out.println( names.remove("Golu"));
    }
}
