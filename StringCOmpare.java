import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringCOmpare {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        Set<Character> hash_Set1 = new HashSet<>();
        Set<Character> hash_Set2 = new HashSet<>();
        if(s1.length() > s2.length())
        {
            for (int i = 0; i < s1.length(); i++) {
                hash_Set1.add(s1.charAt(i));
                if(i< s2.length())
                {
                    hash_Set2.add(s2.charAt(i));
                }
            }
        }
        else if(s1.length() < s2.length())
        {
            for (int j = 0; j < s2.length(); j++) {
                hash_Set2.add(s2.charAt(j));
                if(j< s1.length())
                {
                    hash_Set1.add(s1.charAt(j));
                }
            }
        }
        else
        {
            for (int i = 0; i < s1.length(); i++)
            {
                hash_Set1.add(s1.charAt(i));
                hash_Set2.add(s2.charAt(i));

            }
        }

        if(Collections.disjoint(hash_Set1,hash_Set2))
        {
            return "NO";
        }
        else
        {
            return "YES";

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);

        }

    }
}
