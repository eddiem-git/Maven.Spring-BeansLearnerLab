package com.example.BeanLeanerLab.model;

import com.example.BeanLeanerLab.repos.Teacher;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

import java.lang.annotation.Annotation;

public class Classroom implements Bean {

    private final Students students;
    private final Instructors instructors;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
            teacher.lecture(this.students,numberOfHours);
    }

    @Override
    public String[] value() {
        return new String[0];
    }

    @Override
    public String[] name() {
        return new String[0];
    }

    @Override
    public Autowire autowire() {
        return null;
    }

    @Override
    public boolean autowireCandidate() {
        return false;
    }

    @Override
    public String initMethod() {
        return null;
    }

    @Override
    public String destroyMethod() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
