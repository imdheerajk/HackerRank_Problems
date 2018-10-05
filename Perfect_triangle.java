
/**
 *
 * @author Dheeraj
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Perfect_triangle {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int check_array [] = new int[n];
      
      for(int i = 0; i< check_array.length; i++)
      {
          int hypoten = sc.nextInt();
          check_array[i] = hypoten;
      }
      int result = check_triangle(check_array);
        System.out.println("Result: "+ result); 
    }

    private static int check_triangle(int[] check_array) 
    {
        int result = 0;
        for(int i = 0; i< check_array.length; i++)
        {
            double sqrt = Math.sqrt(check_array[i]);
            int no = (int)sqrt;
            if(Math.pow(sqrt, 2) == (Math.pow(no, 2)))
            {
                int gcd = 0;
                for(int j = 2; j<check_array[i]; j++)
                {
                    if(check_array[i]%j == 0)
                    {
                        gcd = 1;
                        break;
                    }
                }
                
                if(gcd == 0)
                {
                    result++;
                }
            }
        }
        
        return (result);
    }
}