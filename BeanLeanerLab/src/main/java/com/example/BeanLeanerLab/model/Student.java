package com.example.BeanLeanerLab.model;

import com.example.BeanLeanerLab.repos.Learner;

public class Student extends Person implements Learner {

    public double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
