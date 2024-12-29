package basics.oop.optiona.task1.test;


import basics.oop.optiona.task1.manager.StudentManager;
import basics.oop.optiona.task1.student.Student;

import java.text.ParseException;


public class TestStudent {
    public static void main(String[] args) throws ParseException {
        StudentManager studentManager = new StudentManager();
        studentManager.init();
        studentManager.addStudents(new Student("И-101", 1, "информатики", 84845, "ул. Розы-Люксембург", "23/12/2000", "Минич", "Максимилиан", "Андреевич"),
                new Student("Э-202", 2, "экономики", 87544, "ул.Янки Купалы", "13/02/1999", "Савчук", "Даниил", "Олегович"));

         studentManager.printListAccordingGivenFaculty("информатики");
        System.out.println();
        studentManager.printListOfStudentsForEachFacultyAndCourse();
        System.out.println();
        studentManager.printListsOfStudentsBornAfterAGivenYear("22/02/1998");
        System.out.println();
        studentManager.printListStudyGroup();




    }
}
