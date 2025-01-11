package basics.functionale.interfaces.optiona.task7.test;

import basics.functionale.interfaces.optiona.task7.student.Student;

import java.util.Arrays;
import java.util.Comparator;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Wasil",15, 9), new Student("Asia", 13, 5), new Student("Peta", 10, 8), new Student("Sana", 7, 9),
                                            new Student("Marsel", 10, 10), new Student("Linda", 23, 8)};
        Arrays.stream(students).
                filter(student -> student.getGrade() > 8)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

    }
}
