//check if two strings are anagrams of each other or not

import java.util.Scanner;

public class newAnagram {

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() == s2.length()) //check length 
        {
            int a = 0;
            for(int i = 0; i< s1.length(); i++)
            {
                int count1 = 0;
                int count2 = 0;
                char compareS1 = s1.charAt(i);
                for(int j = 0; j < s1.length(); j++) 
                {
                    if(compareS1 == s1.charAt(j)){
                        count1++;
                    }
                    if(compareS1 == s2.charAt(j)){
                        count2++;
                    }
                }


                //System.out.println(count1 + " " + count2) ;
                if(count1 == count2) {
                    a++;
                }
                else{ return false;}
            }
            if(a == s1.length()){return true;}
            else{return false;}
        }
        else
        {
            return false;
        }



    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
