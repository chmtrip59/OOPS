package in.CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);
        System.out.println(numList);
        //Sort the collection
        Collections.sort(numList);

//        Utility.print(numList);
        System.out.println(numList);
        // Reverse the list
        Collections.reverse(numList);

        System.out.println(numList);

        // NO modification is allowed
        List<Integer> unModifiable = Collections.unmodifiableList(numList);

        unModifiable.add(77);

    }
}
