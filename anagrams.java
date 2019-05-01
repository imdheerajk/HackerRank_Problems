//Check if the two strings are anagrams of each other
//Using hashmap we create map of each character and its freequency in the string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagrams {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s1.length(); i++) {
                char letter = s1.charAt(i);
                if (!map.containsKey(letter)) //if map doees not have char then create it and put 1 in frequncy
                {
                    map.put(letter, 1);
                } else  //else just update the characers frequency
                {
                    int count = map.get(letter);
                    map.put(letter, ++count);
                }

            }
            //in this loop we check each character from string two and then subtract the count of its frequency by one.
            for (int j = 0; j < s2.length(); j++)   
            {
                char s2letter = s2.charAt(j);
                if (!map.containsKey(s2letter)) {
                    return false;
                }
                int count = map.get(s2letter);
                if (count == 0) {
                    return false;
                } else {
                    map.put(s2letter, --count);
                }
            }

            return true;

        } else {
            return false;
        }

    }

}
