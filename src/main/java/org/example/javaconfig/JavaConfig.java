package org.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example.javaconfig")
public class JavaConfig {


    @Bean
    public Samosa getSamosa() {
//        creating and returning a new Samosa object
        return new Samosa();
    }

    @Bean(name = {"firstStudent", "secondStudent"})
    public Student getStudent() {
//        creating and returning a new Student object
        return new Student(getSamosa());
    }
}
