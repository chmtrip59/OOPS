package in.CollectionAndGenerics.Challenges;

import java.util.*;

public class UsingCustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion","Ant","Zebra");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

        customComparator(list);
        System.out.println(list);
    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
    public static void customComparator(List<String> myList){
        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)) {
                    return 0;
                }else if(o1.charAt(0) < o2.charAt(0)){
                    return -1;//If we use -1 then smallest comes first(Ascending order)

                }else {
                    return 1;//If we use 1 then biggest comes first(descending order)
                }
            }
        });
    }
}
