import java.util.Scanner;

public class Reverse {
    public static void main(String arg[])
    {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to reverse");

    int num = sc.nextInt();
    int temp = num;
    int rev = 0;
    while(num > 0)
    {
        rev = rev*10 + num%10;
        num = num/10;
    }
    System.out.println("Reverse of number: "+temp+" is "+rev);
    System.out.println("################ With Recursion ###############");

    rev(temp);
    }

    public static void rev(int n)
    {
        if(n < 10)
        {
            System.out.print(n);
        }
        else
        {
          System.out.print(n%10);
          rev(n/10);
        }
    }

}
