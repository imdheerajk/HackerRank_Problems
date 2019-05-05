import java.util.Scanner;

public class JumpingOnClouds {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numArr[] = new int[num];
        for (int i = 0; i < num; i++)
        {
            numArr[i] = sc.nextInt();
        }

        int result = jumpMethod(numArr);
        System.out.println(result);
    }

    private static int jumpMethod(int arr[])
    {
        int move = 0;
        int currentPosition = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(currentPosition < arr.length-2)
            {
                if(arr[currentPosition + 1] == 0 && arr[currentPosition + 2] == 0)
                {
                    if(currentPosition >= arr.length)
                    {
                        break;
                    }
                    else
                    {
                        currentPosition = currentPosition + 2;
                        move++;
                    }

                }
                else if(arr[currentPosition+1] == 1 && arr[currentPosition+2] == 0)
                {
                    if(currentPosition >= arr.length)
                    {
                        break;
                    }
                    else
                    {
                        currentPosition = currentPosition + 2;
                        move++;
                    }

                }
                else if(arr[currentPosition+1] == 0 && arr[currentPosition+2] == 1)
                {
                    if(currentPosition >= arr.length)
                    {
                        break;
                    }
                    else
                    {
                        currentPosition = currentPosition + 1;
                        move++;
                    }

                }
            }
            else
            {
                if(currentPosition < arr.length-1)
                {
                    if(arr[currentPosition+1] == 0)
                    {
                        currentPosition = currentPosition+1;
                        move++;
                    }
                    else
                    {
                        currentPosition = currentPosition+2;
                        move++;
                    }
                }


            }



        }
        return move;

    }
}
