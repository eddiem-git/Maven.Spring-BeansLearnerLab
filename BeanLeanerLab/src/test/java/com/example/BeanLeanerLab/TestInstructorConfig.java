package com.example.BeanLeanerLab;

import com.example.BeanLeanerLab.model.Instructors;
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
public class TestInstructorConfig {

    @Autowired
    @Qualifier(value = "UsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier(value = "UkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier(value = "instructors")
    private Instructors instructors;

    @Test
    public void testTcUsaInstructors(){
        String[] currentUsaInstructorsNames = {"Leon", "Tariq", "Kris"};
        test(this.tcUsaInstructors, currentUsaInstructorsNames);
    }

    @Test
    public void testTcUkInstructors(){
        String[] currentUkInstructorsNames = {"John", "Joe", "Jacob"};
        test(this.tcUkInstructors, currentUkInstructorsNames);
    }

    @Test
    public void testInstructors(){
        String[] currentInstructorNames = {"Froilan", "Chris", "Kris"};
        test(this.instructors, currentInstructorNames);
    }


    private void test(Instructors instructors, String[] expectedNames) {
        Assert.assertTrue(instructors.containsAll(expectedNames));
    }
}
