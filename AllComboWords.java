/*
Author: Dheeraj Kanojia
Description: This program displays all the six letter words which are made of combination of two smaller words
*/


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllComboWords {
    public static void main(String args[])
    {

        List<String> resultList1 = checkWord();

        resultList1.forEach(System.out::println);
    }

    //This function creates list of all the words present in the dictionary so that we dont have to iterate the file again and again
    private static List<String> checkWord()
    {

        String filename = "/Yardi/Exercise/dictionary.txt";
        List<String> dictList = new ArrayList<>();
        List<String> twoLetterList = new ArrayList<>();
        List<String> threeLetterList = new ArrayList<>();
        List<String> fourLetterList = new ArrayList<>();
        List<String> sixLetterList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        try(Stream<String> allWordsStream = Files.lines(Paths.get(filename)))  //using Stream to get all the words from dictionary
        {
            dictList = allWordsStream.map(String::toLowerCase).collect(Collectors.toList()); //Converting them to lowercase and storing them in dictList
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
//Next we iterate dictList and create three list all 2words, 3words, 4words list to make the search space smaller and make it faster
        for(int i = 0; i<dictList.size(); i++)
        {
            if(dictList.get(i).length() == 6)
            {
                sixLetterList.add(dictList.get(i));
            }

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
        for(int i = 0; i < sixLetterList.size(); i++)
        {
            String Ftwo = sixLetterList.get(i).substring(0,2);
            String Lfour = sixLetterList.get(i).substring(2);

            String FirstFour = sixLetterList.get(i).substring(0,4);
            String LastTwo = sixLetterList.get(i).substring(4);

            String FirstThree = sixLetterList.get(i).substring(0,3);
            String LastThree = sixLetterList.get(i).substring(3);

            String reesult = "";
            if(twoLetterList.contains(Ftwo) && fourLetterList.contains(Lfour))
            {
                reesult = Ftwo+" + "+Lfour+" = "+sixLetterList.get(i);
                resultList.add(reesult);
            }

            if(fourLetterList.contains(FirstFour) && twoLetterList.contains(LastTwo))
            {
                reesult = FirstFour+" + "+LastTwo+" = "+sixLetterList.get(i);
                resultList.add(reesult);
            }

            if(threeLetterList.contains(FirstThree) && threeLetterList.contains(LastThree))
            {
                reesult = FirstThree+" + "+LastThree+" = "+sixLetterList.get(i);
                resultList.add(reesult);
            }


        }

        return resultList;
    }




}
