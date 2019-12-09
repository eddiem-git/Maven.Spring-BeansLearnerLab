package com.example.BeanLeanerLab;

public class Classroom {

    private final Students students;
    private final Instructors instructors;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
    }

}
