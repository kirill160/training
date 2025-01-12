package basics.string.optiona.task1.task;

import org.jetbrains.annotations.NotNull;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ModificationText {

    private String readTextInList() {
        String allContent = "";

        try {
            allContent = Files.readString(Path.of("C:\\Users\\Kiril\\training\\basics\\string\\optiona\\task1\\text.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        return allContent;
    }

    public void changeLetter(int indexString, char symbol) {
        List<String> result = new ArrayList<>();
        List<String> sentences = List.of(readTextInList().split("\\s+[\\t\\n\\x0B\\f\\r]"));

        if (sentences != null) {

            for (String sentence : sentences) {

                String[] words = sentence.split("\\s+");

                for (String word : words) {

                    StringBuilder sb = new StringBuilder(word);

                    if (word.length() > indexString && Character.isLetter(word.charAt(indexString))) {

                        sb.setCharAt(indexString, symbol);
                        result.add(sb + " ");

                    } else {

                        result.add(word + " ");
                    }

                }

                result.add("\n");
            }
            writeText(result);

        }
    }


    private void writeText(@NotNull List<String> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Kiril\\training\\basics\\string\\optiona\\task1\\result text.txt"))) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {

                sb.append(list.get(i));

            }

            char[] buffer = sb.toString().toCharArray();

            if (!list.isEmpty()) {

                bw.write(buffer);
            }
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
