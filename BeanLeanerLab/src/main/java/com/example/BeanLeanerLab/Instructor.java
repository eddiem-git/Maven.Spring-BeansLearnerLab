package com.example.BeanLeanerLab;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }
   /* Instructor should have a concrete implementation of the teach
    method which invokes the learn method on the specified Learner object.*/
    @Override
    public void teach(Learner learner, double numberOfHours) {

    }
    /* Instructor should have a concrete implementation of the lecture
     method which invokes the learn method on each of the elements in the specified array of Learner objects.*/
    //(numberOfHours) should be evenly split amongst the learners.
    //double numberOfHoursPerLearner = numberOfHours / learners.length;
    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

    }
}
