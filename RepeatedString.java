import java.util.Scanner;

public class RepeatedString {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String userString = sc.next();
        long result = repeatedString(userString, num);
        System.out.println(result);
    }
    private static long repeatedString(String s, long num)
    {

        long resultnew = 0;
        if(s.length() == 1)
        {
            if(s.charAt(0) == 'a')
            return num;
        }
        else
        {
            long count = 0,count2 = 0;

            long remainder = num%s.length();
            long quptient = num/s.length();
            long remCount = 0;
            for(int i = 0; i< s.length(); i++)
            {
                if(s.charAt(i) == 'a')
                {
                    count++;
                }
                if (i < remainder)
                {
                    if(s.charAt(i) == 'a')
                    {
                        count2++;
                    }

                }

            }
            for(int i = 0; i < remainder; i++)
            {
                if(s.charAt(i) == 'a')
                {
                    remCount++;
                }
            }
            resultnew = (quptient * count) + count2;
        }
        return resultnew;
    }


}
