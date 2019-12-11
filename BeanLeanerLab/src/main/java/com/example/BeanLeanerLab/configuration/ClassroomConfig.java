package com.example.BeanLeanerLab.configuration;

import com.example.BeanLeanerLab.model.Classroom;
import com.example.BeanLeanerLab.model.Instructors;

import com.example.BeanLeanerLab.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    @Autowired
    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students){
            return new Classroom(instructors, students);
    }
    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("previousStudents") Students students){
        return new Classroom(instructors, students);
    }
}
