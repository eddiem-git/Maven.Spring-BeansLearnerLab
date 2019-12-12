package com.example.BeanLeanerLab.model;

import com.example.BeanLeanerLab.repos.Teacher;

public class Classroom {

    private final Students students;
    private final Instructors instructors;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
            teacher.lecture(this.students,numberOfHours);
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
