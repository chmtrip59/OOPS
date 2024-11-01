package in.MapExamplechallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();

        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Porkistan","Chuslamabad");
        countryMap.put("Nepal","Kathmandu");
        countryMap.put("Srilanka","Columbo");

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the country name:");

        String CountryName = in.next();

        if(countryMap.containsKey(CountryName)){
            System.out.printf("Capital of the %s is %s ",CountryName,countryMap.get(CountryName));
        }else{
            System.out.println("Try next time");
        }

    }
}
