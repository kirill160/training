package basics.functionale.interfaces.optiona.task7.student;

public class Student {
    private String name;
    private int ageOfYear;
    private int grade;

    public Student(String name, int ageOfYear, int grade) {
        this.name = name;
        this.ageOfYear = ageOfYear;
        this.grade = grade;
    }
    public Student(){

    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeOfYear() {
        return ageOfYear;
    }

    public void setAgeOfYear(int ageOfYear) {
        this.ageOfYear = ageOfYear;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ageOfYear=" + ageOfYear +
                ", grade=" + grade +
                '}';
    }
}
