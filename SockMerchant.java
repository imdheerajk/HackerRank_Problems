import java.util.*;

public class SockMerchant {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] ar = new int[num];

        for (int i = 0; i < num; i++)
        {
            ar[i] = sc.nextInt();
        }

        int result = sockMerchant(num, ar);
        System.out.println(result);
    }

    static int sockMerchant(int n, int[] ar) {
        int count =1;
        Map<Integer, Integer> SocksMap = new LinkedHashMap<>();
        for(int i = 0; i < ar.length; i++)
        {
//            int value=i;

            if(SocksMap.containsKey(ar[i]))
            {
                int val = SocksMap.get(ar[i]);
                SocksMap.put(ar[i], ++val);
            }
            else
            {
                SocksMap.put(ar[i], 1);
            }


        }
        int pair = 0;

        for (Map.Entry<Integer,Integer> socksEntry : SocksMap.entrySet()) {

            int val = socksEntry.getValue();
            while(val > 0)
            {
                if((val - 2) >= 0)
                {
                    pair++;
                }
                val = val-2;
            }
            //System.out.println("Key"+ socksEntry.getKey() +" " + "Value" + socksEntry.getValue());
        }


       return pair;
    }


}
