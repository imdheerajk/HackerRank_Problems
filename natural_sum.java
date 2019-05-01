import java.util.Scanner;
import java.lang.*;

public class natural_sum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = sum_all(num);
        if(result == -1){
            System.out.println("INVALID NUMBER");
        }
        else
            System.out.println(result);

    }
    static int sum_all(int n){
        if(n < 0){
            return -1;
        }
        if(n != 0)
        {
            return n + sum_all(n-1);
        }
        else
        {
            return n;
        }
    }
}
