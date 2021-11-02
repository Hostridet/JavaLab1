package com.company;

public class Main {

    public static void main(String[] args) {
        WordList Word = new WordList();
        Word.SetArrayWord("cat");
        Word.SetArrayWord("mouse");
        Word.SetArrayWord("frog");
        Word.SetArrayWord("dog");
        Word.SetArrayWord("dog");
        System.out.println(Word.numWordsOfLength(5));

    }


}
