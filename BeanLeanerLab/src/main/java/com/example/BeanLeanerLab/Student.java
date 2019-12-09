package com.example.BeanLeanerLab;

public class Student extends Person implements Learner {

    public double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

   /* Student has a concrete implementation of the learn method which
    increments the totalStudyTime by the specified numberOfHours.*/
    @Override
    public void learn(double numberOfHours) {

    }

    //Student should have a getTotalStudyTime() method and returns the totalStudyTime.
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
