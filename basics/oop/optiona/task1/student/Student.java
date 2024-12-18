package basics.oop.optiona.task1.student;

public class Student {
    private static int value = 0;
    private int id = value++;
    private String surName;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private int phone;
    private String faculty;
    private int course;
    private String group;

    public Student(String group, int course, String faculty, int phone, String address, String dateOfBirth, String patronymic, String name, String surName) {
        this.group = group;
        this.course = course;
        this.faculty = faculty;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.patronymic = patronymic;
        this.name = name;
        this.surName = surName;
    }

    public Student() {

    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", surName='" + surName + ", name='" +
                name + ", patronymic='" + patronymic + ", dateOfBirth='" +
                dateOfBirth + ", address='" + address + ", phone='" +
                phone + ", faculty='" + faculty + ", course=" +
                course + ", group='" + group + '}';

    }
}
