package com.company;
import java.util.ArrayList;

public class WordList {
    private final ArrayList<String> myList = new ArrayList<String>();

    public int numWordsOfLength(int len)
    {
        int counter = 0;
        for(String s: myList)
        {
            if (s.length() == len)
                counter++;
        }
        return counter;
    }
    public void SetArrayWord(String word)
    {
        myList.add(word);
    }
}
