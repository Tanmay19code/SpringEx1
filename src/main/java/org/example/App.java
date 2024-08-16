package org.example;

import intf.ServiceIntf;
import org.example.impl.HelloBean;
import org.example.impl.Person;
import org.example.intf.HelloIntf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//
//        context.scan("impl");
//        context.refresh();
//
//
//        ServiceIntf ser = (ServiceIntf) context.getBean("courseService");
//        System.out.println(ser.getServiceName());

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        HelloIntf intf = (HelloIntf) context.getBean("hellobean");
        System.out.println(intf.greet("John"));
        System.out.println(intf.greetByName("Hello"));

        if(intf instanceof HelloBean){
            HelloBean bean = (HelloBean) intf;
            System.out.println(bean.getPerson());
        }




    }
}
