import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class NikitaGame {

    /*
     * Complete the arraySplitting function below.
     */

    public static int kahaKaato(int sum[], int leftsum)
    {
        int score = 0;
        for (int i = 0; i < sum.length; i++) {
            if(leftsum - sum[i] == sum[i])
            {
                score++;
                return i;
            }

        }
       return score;
    }

    public static int kaato(int arr[], int posiition){

        int leftHalf[] = new int[posiition + 1];
        int rightHalf[] = new int[arr.length-(posiition+1)];
        for (int i = 0; i < arr.length; i++)
        {
            if(i <= posiition)
            {
                leftHalf[i] = arr[i];
            }
            else if(i > posiition)
            {
                rightHalf[i] = arr[i];
            }
        }
        return 0;
    }


    public static int [] sumMethod(int arr[])
    {
        int sum[] = new int[arr.length];
        int arrSum = 0, score = 0;
        for (int i = 0; i < arr.length ; i++) {

            arrSum =  arrSum + arr[i];
            sum[i] = arrSum;
            //System.out.println(sum[i]);
        }
        return sum;
    }

    static int arraySplitting(int[] arr) {



        //int position = kahaKaato(sum, leftSum);

        //System.out.println(position+" =position");

return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int arrCount = Integer.parseInt(scanner.nextLine().trim());

            int[] arr = new int[arrCount];

            for (int arrItr = 0; arrItr < arrCount; arrItr++) {
                arr[arrItr] = scanner.nextInt();
            }

            int result = arraySplitting(arr);
System.out.println(result);

        }


    }
}
