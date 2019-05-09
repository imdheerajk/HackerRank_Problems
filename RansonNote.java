import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RansonNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int n = sc.nextInt();

        String[] magazine = new String[m];
        List<String> magzineList = new ArrayList<>();
        List<String> noteList = new ArrayList<>();
        String[] note = new String[n];

        for (int i = 0; i < m; i++) {
            magzineList.add(sc.next());
        }
        for (int i = 0; i < n; i++) {

            noteList.add(sc.next());
        }

        checkMagazine(magzineList, noteList);

        sc.close();

    }

    private static void checkMagazine(List<String> magzineList, List<String> noteList) {
        int flag = 0;
        for (int i = 0; i < noteList.size(); i++) {
            if(!magzineList.contains(noteList.get(i))){
                flag = 1;
                break;
            }
            else
            {
                magzineList.remove(noteList.get(i));
            }
        }

        if(flag == 0){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


    }


}
