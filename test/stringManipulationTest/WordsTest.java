package stringManipulationTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import stringManipulation.Words;

public class WordsTest {

    @Test
    void wordCountTest() {

        //Happy Path
        String sentence = "Hello World";
        Assert.assertEquals(2,Words.wordCount(sentence));

        //Blank
        sentence = "";
        Assert.assertEquals(0,Words.wordCount(sentence));

        //Number + FullStop+Space
        sentence = "9 Hello. Hello World";
        Assert.assertEquals(3,Words.wordCount(sentence));

        //Space at the Beginnning
        sentence = " Hello";
        Assert.assertEquals(1,Words.wordCount(sentence));

        //3 Spaces in between
        sentence = " Hello   World";
        Assert.assertEquals(2,Words.wordCount(sentence));

        //3 Spaces at the beginning
        sentence = "   Hello";
        Assert.assertEquals(1,Words.wordCount(sentence));

        //One Word
        sentence = "Hello";
        Assert.assertEquals(1,Words.wordCount(sentence));

        //Only Spaces
        sentence = "   ";
        Assert.assertEquals(0,Words.wordCount(sentence));

        //Just Numbers
        sentence = "999";
        Assert.assertEquals(0,Words.wordCount(sentence));

    }

    @Test
    void testgetCountWithoutStopWords() {

        String input = "the a";
        Assert.assertEquals(0, Words.getCountWithoutStopWords(input));

        input = "Mary had a little lamb";
        Assert.assertEquals(4, Words.getCountWithoutStopWords(input));

        input = "";
        Assert.assertEquals(0, Words.getCountWithoutStopWords(input));

        input = "the a on off";
        Assert.assertEquals(0, Words.getCountWithoutStopWords(input));

        input = "the a on of";
        Assert.assertEquals(1, Words.getCountWithoutStopWords(input));

        input = "Hello World";
        Assert.assertEquals(2, Words.getCountWithoutStopWords(input));


    }

}
