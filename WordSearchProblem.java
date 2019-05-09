/*
Author: Dheeraj Kanojia
Description: This program accepts 6 characters words array and gives finds out if they are combination of words.
 */


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.exit;

public class WordSearchProblem {
    public static void main(String args[])
    {
        String userArray[] = getUserArray(); //Getting  user input

        List<String> resultList1 = checkWord(Arrays.asList(userArray));

        resultList1.forEach(System.out::println);
    }

    //This function takes user input and returns string array back.
    private static String [] getUserArray()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many words you want to check");
        int num = sc.nextInt();

        System.out.println("Enter Six letter words only");

        String userArray[] = new String[num];
        for (int i = 0; i < num; i++)
        {
            String word = sc.next();
            userArray[i] = word.toLowerCase();
            if(userArray[i].length() != 6) //accepts only 6 letter words
            {
                System.out.println("Please enter 6 character words only.");
                exit(0);
            }
        }
        return userArray;
    }

//This function takes user words as an input
    //Creates List of
    private static List<String> checkWord(List<String> UserList)
    {

        String filename = "/Yardi/Exercise/dictionary.txt";
        List<String> dictList = new ArrayList<>();
        List<String> twoLetterList = new ArrayList<>();
        List<String> threeLetterList = new ArrayList<>();
        List<String> fourLetterList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        try(Stream<String> allWordsStream = Files.lines(Paths.get(filename)))  //using Stream to get all the words from dictionary
        {
            dictList = allWordsStream.map(String::toLowerCase).collect(Collectors.toList()); //Converting them to lowercase and storing them in dictList
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
//Next we iterate dictList and create three list all 2words, 3words, 4words list
        for(int i = 0; i<dictList.size(); i++)
        {

            if(dictList.get(i).length() == 4)
            {
                fourLetterList.add(dictList.get(i));
            }
            if(dictList.get(i).length() == 3)
            {
                threeLetterList.add(dictList.get(i));
            }
            if(dictList.get(i).length() == 2)
            {
                twoLetterList.add(dictList.get(i));
            }
        }


//here we check each word from user input list whether its composed of two smaller words or not
        //6letter word can be made of 2letter + 4letter/ 3letter + 3letter / 4letter + 2letter
        for(int i = 0; i < UserList.size(); i++)
        {
            String Ftwo = UserList.get(i).substring(0,2);
            String Lfour = UserList.get(i).substring(2);

            String FirstFour = UserList.get(i).substring(0,4);
            String LastTwo = UserList.get(i).substring(4);

            String FirstThree = UserList.get(i).substring(0,3);
            String LastThree = UserList.get(i).substring(3);

            String reesult = "";
            int foundFlag = 0;
            if(twoLetterList.contains(Ftwo) && fourLetterList.contains(Lfour))
            {
                reesult = Ftwo+" + "+Lfour+" = "+UserList.get(i);
                resultList.add(reesult);
                foundFlag = 1;
            }

            if(fourLetterList.contains(FirstFour) && twoLetterList.contains(LastTwo))
            {
                reesult = FirstFour+" + "+LastTwo+" = "+UserList.get(i);
                resultList.add(reesult);
                foundFlag = 1;
            }

            if(threeLetterList.contains(FirstThree) && threeLetterList.contains(LastThree))
            {
                reesult = FirstThree+" + "+LastThree+" = "+UserList.get(i);
                resultList.add(reesult);
                foundFlag = 1;
            }
            if(foundFlag == 0)
            {
                reesult = "No Combination found for: "+UserList.get(i);
                resultList.add(reesult);
            }

        }

        return resultList;
    }




}
