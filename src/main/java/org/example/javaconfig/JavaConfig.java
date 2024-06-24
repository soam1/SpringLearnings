package org.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example.javaconfig")
public class JavaConfig {

    @Bean
    public Student getStudent() {
//        creating and returning a new Student object
        return new Student();
    }
}
