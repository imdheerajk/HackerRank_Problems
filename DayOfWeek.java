

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Dheeraj
 */
public class DayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String year = sc.next();
        String month = sc.next();
        String day = sc.next();
        Problem_solving ps = new Problem_solving();
        
        ps.getDay(year, month, day);
    }

    private void getDay(String year, String month, String day) {
     
        int year1 = Integer.parseInt(year);
        int month1 = Integer.parseInt(month);
        int day1 = Integer.parseInt(day);
        LocalDate localDate = LocalDate.of(year1, month1, day1);
        DayOfWeek dow = localDate.getDayOfWeek();
        System.out.println(dow);
    
    
    }
    
    
    
}
