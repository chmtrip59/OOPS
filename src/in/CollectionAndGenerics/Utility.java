package in.CollectionAndGenerics;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E o : collection) {
            System.out.printf("%s ",o.toString());
        }
        System.out.println();
    }
}
//E is a generics