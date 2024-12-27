package basics.extendses.optiona.task1.text;

import basics.extendses.optiona.task1.sentence.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Text {
    private final List<Sentence> sentenceList;
    private final String title;

    public Text(String title) {
        this.title = title;
        this.sentenceList = new ArrayList<>();

    }

    public void addSentence(Sentence sentence) {
        sentenceList.add(sentence);
    }

    public void printTitle() {
        System.out.println("-------------------" + title + "------------");
    }

    public void printText() {
        for (Sentence sentence : sentenceList) {
            sentence.printSentence();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(sentenceList, text.sentenceList) && Objects.equals(title, text.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentenceList, title);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentenceList=" + sentenceList +
                ", title='" + title + '\'' +
                '}';
    }
}
