import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConvertor {

    /*
     * Complete the timeConversion function below.
     */
    static void timeConversion(String s) {
        String s1[]=s.split(":");
        String amPm=s1[2].substring(2);
        String sec = s1[2].substring(0,2);

        int t = 0;
// System.out.println(t);
        if( (amPm.equals("PM")) && ((Integer.parseInt(s1[0]))!=12) ){
            t=Integer.parseInt(s1[0]);
            t=t+12;
            s1[0]=String.valueOf(t);
        }
        if( (amPm.equals("AM")) && ( (Integer.parseInt(s1[0]))==12)){
// System.out.println(“hello”);
            t=0;
            s1[0]=String.valueOf(t);
        }


// System.out.printf(“%02d:%02d:%02s”,s1[0],s1[1],t);
        System.out.printf("%02d:%02d:%02d",(Integer.parseInt(s1[0])),(Integer.parseInt(s1[1])),(Integer.parseInt(sec)));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        timeConversion(s);


    }
}
