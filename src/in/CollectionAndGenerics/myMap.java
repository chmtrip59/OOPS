package in.CollectionAndGenerics;

import java.util.HashMap;
import java.util.Map;

public class myMap {
    public static void main(String[] args) {
        //Declare map

        Map<String,Integer> map = new HashMap<>();

        // Adding k-value pairs to the map

        map.put("Soham",10);
        map.put("Golu",32);
        map.put("Ram",10);
        map.put("Shyam",35);

        System.out.println(map.size());
        System.out.println(map.get("Golu"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Soham"));
        System.out.println(map.size());


        for (String s : map.keySet()) {
            System.out.printf("%S : %d, ",s,map.get(s));
        }

    }



}
