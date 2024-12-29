package basics.oop.optiona.task1.manager;

import basics.oop.optiona.task1.student.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentManager {
    private List<Student> studentList;
    private static final int FIRST_ELEMENT_LIST = 0;
    private static final int FIRST_COURSE = 1;
    private static final int SECOND_COURSE = 2;
    private static final int THIRD_COURSE = 3;
    private static final int FOURTH_COURSE = 4;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public void init() {
        if (studentList == null) {
            studentList = new ArrayList<>();
        }
    }

    public void addStudents(Student... students) {
        studentList.addAll(List.of(students));
    }

    public void printListAccordingGivenFaculty(String faculty) {
        System.out.println("Список студентов заданного факультета: ");
        for (Student student : studentList) {
            if (student.getFaculty().contains(faculty) && !faculty.isEmpty()) {
                System.out.println(student);
            }
        }
    }

    public void printListOfStudentsForEachFacultyAndCourse() {
        System.out.println("Список студентов для каждого факультета и курса");
        studentList.sort(Comparator.comparing(Student::getFaculty).thenComparing(Student::getCourse));
        studentList.forEach(System.out::println);
    }


    public void printListsOfStudentsBornAfterAGivenYear(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = sdf.parse(date);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        int givenDate = calendar.get(Calendar.YEAR);

        for (Student student : studentList) {
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(student.getDateOfBirth());

            Calendar calendar1 = new GregorianCalendar();
            calendar1.setTime(date2);

            int yearOfBirthStudent = calendar1.get(Calendar.YEAR);
            if (yearOfBirthStudent > givenDate) {
                System.out.println(student);
            }
        }
    }

    public void printListStudyGroup(){
        for (int i = 0; i < studentList.size() - 1; i++) {
            if(studentList.get(i).getGroup().contains(studentList.get(i + 1).getGroup())){
                System.out.println(studentList.get(i));
            }
        }
    }

}
