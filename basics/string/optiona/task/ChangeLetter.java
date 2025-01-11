package basics.string.optiona.task;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class ChangeLetter {

    private String[] readTextInList() {
        String[] words = new String[0];

        try {
            words = Files.readString(Path.of("C:\\Users\\Kiril\\training\\basics\\string\\optiona\\text.txt")).split(" ");

        } catch (IOException e) {
            e.printStackTrace();
        }


        return words;
    }

    public void changeLetter(int indexString, char symbol) {
        List<String> result = new ArrayList<>();
        String[] words = readTextInList();

        if (words != null) {
            for (String word : words) {

                if (word.length() > indexString) {

                    StringBuilder sb = new StringBuilder(word);
                    sb.setCharAt(indexString, symbol);
                    result.add(sb.toString());
                } else {
                    result.add(word);

                }

            }
        }
        writeText(result);

    }


    public void writeText(List<String> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Kiril\\training\\basics\\string\\optiona\\result text.txt"))) {
            if (list != null && !list.isEmpty()) {
                String allString = String.join(" ", list);
                bw.write(allString);
            }
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
