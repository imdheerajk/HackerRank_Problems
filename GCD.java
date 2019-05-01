import java.util.Scanner;

public class GCD {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to find their GCD");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = gcd(num1, num2);
        System.out.println("Result= "+result);
    }

    public static int gcd(int n1, int n2)
    {
        if(n1%n2 == 0)
            return n2;
        if(n2%n1 == 0)
            return n1;

        if(n1 > n2)
            return gcd(n1%n2, n2);
        else
           return gcd(n1,n2%n1);

    }
}
