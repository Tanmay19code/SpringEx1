package impl;

import intf.CourseIntf;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Qualifier("javacourse")
public class JavaCourse implements CourseIntf {

    @Value("1")
    int courseId;
    @Value("Java")
    String courseName;
    @Value("100.0")
    double coursePrice;

    public JavaCourse() {
    }

    @Override
    public String getMyCourseName() {
        return "Java";
    }
    @Override
    public double getMyCoursePrice() {
        return 100.0;
    }
}
