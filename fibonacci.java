import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbes you want in fibonacci series?");

        int num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int n){
        if(n ==1 || n == 2)
        {
            return 1;
        }
        return (fibo(n-1)+ fibo(n-2));
    }



}
