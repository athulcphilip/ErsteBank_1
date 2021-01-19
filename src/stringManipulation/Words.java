package stringManipulation;

import org.jetbrains.annotations.NotNull;
import util.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {


    public static List<String> getWords(@NotNull final String text) {

        final List<String> words = new ArrayList<>();
        final Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            words.add(matcher.group());
        }

        return words;

    }

    public static int getCountWithoutStopWords(@NotNull final String text) {

       int count = 0;
        try {
            final List<String> stopWords =
                    FileReader.readWordsFromFile("/Users/a-8637/Documents/ErsteBank/stopWords.txt");

            final List<String> words = getWords(text);

            count = (int) words.stream()
                    .map(String::toLowerCase)
                    .filter(word -> !stopWords.contains(word))
                    .count();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;

    }

    public static int wordCount(String s) {

        return getWords(s).size();


    }
}
