/*
 * If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5 .
If the value of  is less than 38, no rounding occurs as the result will still be a failing grade.
For example, 84 will be rounded to 85 but 23 will not be rounded because the rounding would result in a number that is less than 40 .
 */

/**
 *
 * @author Dheeraj
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class grading_problem {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
         int result[]= new int[grades.length];
    for(int i=0; i< grades.length; i++)
    {
         if(grades[i] >= 38 && grades[i]%5 > 2)
        {
            result[i] = grades[i]+(5-(grades[i]%5));
        }
        else
        {
            result[i] = grades[i];
        }
        
    }
    return(result);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        for (int j = 0; j< result.length; j++)
        {
            System.out.println(result[j]);
        }
        
    }
}
