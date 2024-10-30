package in.CollectionAndGenerics.Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsingSetForUniqueChar {
    public static void main(String... args) {
        Set<Character> unique = new HashSet<>();

        System.out.println("Please enter your String:\n");

        Scanner in = new Scanner(System.in);

        String userStr = in.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }
        System.out.printf("Your string has %d unique characters:",unique.size());
    }
}
