package basics.nested.optiona.task1.notepad.simple;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private final List<Record> records = new ArrayList<>();
    private final Record record;

    public Notepad(String text, int year, int month, int dayOfMonth) {
        this.record = new Record(text, year, month, dayOfMonth);
        records.add(record);

    }

    public void printRecord() {
        records.forEach(System.out::println);
    }

    public void addText(String text) {
        record.text = record.text + " " +
                text;
    }


    private class Record {
        private String text;
        private LocalDate localDate;

        public Record(String text, int year, int month, int dayOfMonth) {
            this.text = text;
            localDate = LocalDate.of(year, month, dayOfMonth);
        }

        @Override
        public String toString() {
            return "Record{" +
                    "text='" + text + '\'' +
                    ", localDate=" + localDate +
                    '}';
        }
    }
}
