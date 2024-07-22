package BaiTapNhom;

import javax.annotation.processing.Messager;

public class Course {
    private Student[] Liststudents = new Student[1000];
    private String CourseName;
    private int CourseCode;
    private int count = 0;

    public Student[] getStudents() {
        return Liststudents;
    }

    public void setStudents(Student[] students) {
        this.Liststudents = students;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(int courseCode) {
        CourseCode = courseCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student[] getListstudents() {
        return Liststudents;
    }

    public boolean addStudent(Student student) {
        if (isExist(student)) {
          return false;
        }
        this.Liststudents[count++] = student;
        return true;
    }

    public boolean isExist(Student student) {
        for (int i = 0; i < count; i++) {
            if (student.getID() == Liststudents[i].getID()) {
                return true;
            }
        }
        return false;
    }
}
