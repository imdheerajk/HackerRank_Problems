//Given a string, split the string into tokens. Token is a one or more consecutive English alphabetic letters. 
//Then, print the number of tokens, followed by each token on a new line.


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> arTokens = new ArrayList<String>();  //creeating the Arraylist to store the tokens
        String[] s1 = s.split(" "); //creating the array of words from string
        int result = 0;
        for(int i = 0; i < s1.length; i++)
        {
            //String word = s1[i];
            if(s1[i].matches("^[a-zA-Z]+$"))
            {
                //System.out.println(s1[i]);
                arTokens.add(s1[i]);
            }
            else{
                int count = 0;
                String putAr = "";
                for(int j = 0; j <s1[i].length(); j++)
                {

                    if (s1[i].charAt(j) < 'A' || s1[i].charAt(j) > 'Z' &&
                            s1[i].charAt(j) < 'a' || s1[i].charAt(j) > 'z')
                    {
                        //System.out.println();
                        if(putAr.isEmpty() || putAr == "")
                        {
                            continue;
                        }
                        else
                        {
                            arTokens.add(putAr);
                            putAr = "";
                            count = 1;
                        }

                    }
                    else
                    {
                        //System.out.print(s1[i].charAt(j));
                        putAr = putAr+s1[i].charAt(j);
                        if(count == 1)
                        {
                            arTokens.add(putAr);
                        }
                        count = 0;
                    }

                }

                if(count == 0)
                {
                    //System.out.println();
                    result++;
                }

            }

        result++;

        }

        System.out.println(arTokens.size());
        for(int i = 0; i< arTokens.size(); i++)
        {
            System.out.println(arTokens.get(i));
        }

        scan.close();
    }

}
