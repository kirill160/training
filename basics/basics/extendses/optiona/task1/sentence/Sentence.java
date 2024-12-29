package basics.extendses.optiona.task1.sentence;

import basics.extendses.optiona.task1.word.Word;

import java.util.Objects;
import java.util.Scanner;


public class Sentence {
    private final StringBuilder sb = new StringBuilder();
    private final Scanner scanner;

    public Sentence() {
        scanner = new Scanner(System.in);
    }

    public void addWord(Word word) {

        word.setWord(scanner.nextLine());
        sb.append(word.getWord()).append(" ");
        scannerClose(word);
    }

    private void scannerClose(Word word) {
        if (word.getWord().isEmpty() || word.getWord().endsWith(".") || word.getWord().endsWith("!") || word.getWord().endsWith("?")) {
            scanner.close();
        }
    }

    public void printSentence() {
        System.out.println(sb);
    }



    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Sentence)) return false;
        Sentence sentence = (Sentence) object;
        return Objects.equals(sb.toString(), sentence.sb.toString()) && Objects.equals(scanner, sentence.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sb, scanner);
    }
}
