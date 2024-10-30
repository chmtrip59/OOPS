package in.CollectionAndGenerics.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethodInCollections {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,22,11,233,44,4,22,3,4425,3,0);
//Frequency of number in given array list
        System.out.println(Collections.frequency(list,3));
    }

}
