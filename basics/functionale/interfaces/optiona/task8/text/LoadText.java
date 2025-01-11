package basics.functionale.interfaces.optiona.task8.text;


import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class LoadText {
    private static @NotNull List<String> listOfWords() {
        List<String> words = Collections.emptyList();
        try {
            words = List.of(Files.readString(Path.of("C:/Users/Kiril/training/basics/functionale/interfaces/optiona/task8/text.txt")).split("\\s+"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return words;

    }

    public static void printResult(@NotNull String @NotNull [] words) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        int count = 1;

        for (String word : words) {
            sj.add(makeWords(word, count++));
        }

        System.out.println(sj);
    }

    private static @NotNull String makeWords(@NotNull String word, int numberOfWord) {

        int count = (int) listOfWords().stream()
                .filter(s -> s.equalsIgnoreCase(word)).
                count();

        return word + numberOfWord + "-" + count;

    }


}
