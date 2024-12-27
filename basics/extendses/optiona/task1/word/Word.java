package basics.extendses.optiona.task1.word;

import java.util.Objects;


public class Word {
    private String word;


    public Word() {

    }


    public String getWord() {
        return word;
    }

    public void setWord(String words) {
        this.word = words;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(getWord(), word1.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getWord());
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
