package util;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    public static List<String> readWordsFromFile(@NotNull final String filePath) throws IOException {

        final List<String> words = new ArrayList<>();
        try {

            Path path = Paths.get(filePath);
            byte[] bytes = Files.readAllBytes(path);
            words.addAll(Files.readAllLines(path, StandardCharsets.UTF_8));

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return words;
    }
}
