package com.example.BeanLeanerLab.configuration;

import com.example.BeanLeanerLab.model.Classroom;
import com.example.BeanLeanerLab.model.Instructors;
import com.example.BeanLeanerLab.model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }
}
