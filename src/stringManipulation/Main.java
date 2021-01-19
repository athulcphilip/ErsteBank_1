package stringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String args[]){

        System.out.println("Enter Text :");

        try {
            final BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            final String text = reader.readLine();

            System.out.println("Number of Words : " + Words.wordCount(text));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

}
