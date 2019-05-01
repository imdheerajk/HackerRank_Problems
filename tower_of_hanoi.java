//Using Recurssion to solve the tower of Hanoi problem
//A,B,C are the towers

import java.util.Scanner;

public class tower_of_hanoi {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pebs");  //how many units you want to move from start tower to end tower
        int n = sc.nextInt();


        tower_hanoi(n, 'A', 'B', 'C');

    }

    public static void tower_hanoi(int n, char ST, char AX, char ED) //ST-start towr, AX- auxilary tower, ED- end tower
    {
        int count = 0;
        if(n >= 1)
        {
            tower_hanoi(n-1, ST, ED, AX);
            System.out.println("Move "+ST+" To "+ED);
            tower_hanoi(n-1,AX, ST, ED);
        }
    }

}
