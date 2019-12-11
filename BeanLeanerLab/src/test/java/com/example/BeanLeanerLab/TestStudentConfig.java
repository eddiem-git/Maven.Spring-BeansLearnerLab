package com.example.BeanLeanerLab;

import com.example.BeanLeanerLab.model.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier(value = "students")
    private Students currentStudents;


    @Autowired
    @Qualifier(value = "previousStudents")
    private Students previousStudents;


    @Test
    public void testCurrentCohort() {
        String[] currentStudentNames = {"Chung", "Kai", "Mike"};
        test(this.currentStudents, currentStudentNames);
    }


    @Test
    public void testPreviousCohort() {
        String[] previousStudentsNames = {"John", "Elijah", "Muhammad"};
        test(this.previousStudents, previousStudentsNames);
    }


    private void test(Students students, String[] expectedNames) {
        Assert.assertTrue(students.containsAll(expectedNames));
    }

}
