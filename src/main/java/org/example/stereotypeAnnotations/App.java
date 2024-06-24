package org.example.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("javaconfig.xml");
//        Student student = (Student) context.getBean("student");

//        Student student = context.getBean("student", Student.class);
        Student student = context.getBean("thisIsTheBeanNameCreatedBySpring", Student.class);
//        System.out.println(student);
//        System.out.println(student.getAddresses());

        System.out.println(student.hashCode());

        Student student2 = context.getBean("thisIsTheBeanNameCreatedBySpring", Student.class);
        System.out.println(student2.hashCode());
    }
}
