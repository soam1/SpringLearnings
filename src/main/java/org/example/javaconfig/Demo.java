package org.example.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("javaconfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student student = context.getBean("firstStudent", Student.class);
        Student student = context.getBean("getStudent", Student.class);
        System.out.println(student);
        student.study();
    }
}
