import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArList {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Map<Integer,List<Integer>> numericMap= new HashMap<>();
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            List<Integer> insideValueList =new ArrayList<>();
            for(int j=0; j<value;j++){
                int userArrayValue =s.nextInt();
                insideValueList.add(userArrayValue);
            }
            numericMap.put(i+1, insideValueList);
        }
        int queries = s.nextInt();
        List<Object> resultList = new ArrayList<>();
        for(int k=0;k<queries ;k++){
            int lineNo = s.nextInt();
            int posNo = s.nextInt();

            List<Integer> finalList = numericMap.get(lineNo);


                try{
                    resultList.add( finalList.get(posNo-1));
                }
            catch(Exception e)
            {
                resultList.add("ERROR!");
            }




        }
        for(int i = 0; i< resultList.size(); i++)
        {
            System.out.println(resultList.get(i));
        }


    }

}

