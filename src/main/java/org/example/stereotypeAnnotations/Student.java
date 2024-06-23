package org.example.stereotypeAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }

    //    setter and getter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
