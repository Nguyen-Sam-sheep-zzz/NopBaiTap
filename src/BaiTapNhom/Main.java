package BaiTapNhom;

public class Main {
    public static void main(String[] args) {
        CourseConsole courseConsole = new CourseConsole();
        Course course = new Course();
        Student student = new Student(1, "Khanh", 12);
        Student student1 = new Student(2, "Chanh", 12);
        Student student2 = new Student(3, "Tam", 12);
        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        courseConsole.display(course);
    }
}
