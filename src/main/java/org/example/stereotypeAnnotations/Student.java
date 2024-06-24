package org.example.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thisIsTheBeanNameCreatedBySpring")
public class Student {
    @Value("Akash")
    private String name;
    @Value("25")
    private int city;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.city = age;
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + city);
    }

    //    setter and getter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(int city) {
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public int getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
