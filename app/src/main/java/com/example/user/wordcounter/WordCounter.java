package com.example.user.wordcounter;

/**
 * Created by user on 04/07/2017.
 */

public class WordCounter {

    String text;
    int wordCount = 0; // used for the countWords method bellow



    public WordCounter() { // constructor
        this.text = text;
    }


    public int countWords(String text) {
        wordCount = text.split(" ").length;
        return wordCount;
    }



}
