package BaiTap1;

public class Main {
    public static void main(String[] args) {
        Student Student = new Student(01,"Khanh",18);
        Student Student1 = new Student(02,"Chanh",18);
        System.out.println("Full student: ");
        System.out.println(Student.getStudentID());
        System.out.println(Student.getName());
        System.out.println(Student.getAge());
        System.out.println("___________________________________-");
        System.out.println(Student1.getStudentID());
        System.out.println(Student1.getName());
        System.out.println(Student1.getAge());
    }
}
