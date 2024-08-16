package impl;

import intf.ServiceIntf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("courseService")
public class CourseServiceImpl implements ServiceIntf {

    @Value("Course Service")
    String servName;

    public CourseServiceImpl() {
        System.out.println("Course Service default constructor");
    }

    public CourseServiceImpl(String serviceName) {
        System.out.println("Course Service parameterized constructor");
        this.servName = serviceName;
    }

    public String getServName() {
        return servName;
    }

    public void setServName(String servName) {
        this.servName = servName;
    }

    @Override
    public String toString() {
        return "CourseServiceImpl{" +
                "serviceName='" + servName + '\'' +
                '}';
    }

    @Override
    public String getServiceName() {
        return this.servName;
    }

}