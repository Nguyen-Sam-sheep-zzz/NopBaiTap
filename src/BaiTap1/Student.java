package BaiTap1;

public class Student {
    private String name;
    private int age;
    private int StudentID;
    Student() {}
    Student(int StudentID ,String name , int age ) {
        this.StudentID = StudentID;
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return StudentID;
    }
}
