package in.CollectionAndGenerics.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ElementSwaping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,90,0);

        swap(list,2,7);
        System.out.println(list);
    }
    public static void swap(List<Integer> list, int x,int y){
        int swap = list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }
}
