import java.util.*;
class pattern{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<String>();

            String input=sc.next();
            int roundFlag = 0;
            int squareFlag = 0;
            int curlyFlag = 0;
            for(int i = 0; i<input.length(); i++)
            {
                char ch = input.charAt(i);


                if(ch=='('){
                    roundFlag++;
                }
                if(ch==')'){
                    roundFlag--;
                    if(roundFlag < 0){
                        System.out.println("false");
                        break;
                    }
                }
                if(ch=='{'){
                    curlyFlag++;
                }
                if(ch=='}'){
                    curlyFlag--;
                    if(curlyFlag < 0){
                        System.out.println("false");
                        break;
                    }
                }
                if(ch=='['){
                    squareFlag++;
                }
                if(ch==']'){
                    squareFlag--;
                    if(squareFlag < 0){
                        System.out.println("false");
                        break;
                    }
                }




            }

            if(squareFlag == 0 && roundFlag == 0 && curlyFlag == 0){
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }





    }
}



