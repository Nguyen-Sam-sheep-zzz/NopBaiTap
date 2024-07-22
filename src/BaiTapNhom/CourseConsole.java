package BaiTapNhom;

public class CourseConsole {

    CourseConsole() {

    }

    public void display(Course course) {
        if (course.getCount() == 0) {
            System.out.println("There is no student yet");
        }
        for (int i = 0; i < course.getCount(); i++) {
            System.out.println(course.getListstudents()[i]);
        }
        System.out.println();
    }
}
