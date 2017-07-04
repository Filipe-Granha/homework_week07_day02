package com.example.user.wordcounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 04/07/2017.
 */



public class WordCounterTest {

    WordCounter text;


    @Before
    public void before(){
        this.text = new WordCounter();
    }


    @Test
    public void testCanCountWords(){
        assertEquals(6, text.countWords("how many words in a sentence"));
    }



}
