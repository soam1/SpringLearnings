package org.example.javaconfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {

    private Samosa samosa;

    public Student() {
        super();
    }

    public Student(Samosa samosa) {
        super();
        this.samosa = samosa;
    }

    public void study() {
        samosa.display();
        System.out.println("Student is studying");
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
