package in.CollectionAndGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestingList
{
    // It is an interface and generics and generics is a compile time
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        //OR
        List<Integer> intList = new ArrayList<Integer>();
//        List strList = new ArrayList();
        strList.add("Golu");
        strList.add(" Tripathi");
        strList.add(1," Lallan Prasad");
        strList.remove(0);
        if(strList.contains(" Tripathi")){
            System.out.println("Tripathi ji Present hai");
            System.out.println(strList.indexOf(" Tripathi"));
        }

//        System.out.println(strList.get(0));
//        for(int i = 0; i < strList.size();i++){
//            System.out.print(strList.get(i));
//        }
        for (Object o : strList) {
            System.out.print(o);
        }
    }
}
