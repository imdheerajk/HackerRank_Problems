import java.util.Scanner;

public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for factorial");

        int num = sc.nextInt();

        System.out.println("Result: "+ fact(num));
    }
    public static int fact(int n)
    {

       if (n > 0)
        {
           return (n*fact(n-1));
        }
       else
       {
           return 1;
       }

    }
}
