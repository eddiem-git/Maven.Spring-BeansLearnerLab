package com.example.BeanLeanerLab.configuration;

import com.example.BeanLeanerLab.model.Student;
import com.example.BeanLeanerLab.model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    //@Bean whose name attribute is not specified, defaults to the name of the method it is annotating.
    @Bean(name = "currentStudents")
    public Students currentStudents() {
        String[] currentStudents = {"Chung", "Kai", "Mike"};
        return createStudents(currentStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        String[] previousStudents = {"John", "Elijah", "Muhammad"};
        return createStudents(previousStudents);
    }

    private Students createStudents(String[] studentNames) {
        Students students = new Students();
        for (Integer id = 0; id < studentNames.length; id++) {
            String studentName = studentNames[id];
            Student newStudent = new Student(id.longValue(), studentName);
            students.add(newStudent);
        }
        return students;
    }
}
