package com.example.BeanLeanerLab;

import com.example.BeanLeanerLab.model.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void checkCurrentClassroomSize(){
        Integer expectedCurrentSize = 3;
        Integer expectedPreviousSize = 3;

        Integer actualCurrentSize = currentCohort.getInstructors().size();
        Integer actualPreviousSize = currentCohort.getStudents().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }

    @Test
    public void checkPreviousClassroomSize(){
        Integer expectedCurrentSize = 3;
        Integer expectedPreviousSize = 3;

        Integer actualCurrentSize = previousCohort.getInstructors().size();
        Integer actualPreviousSize = previousCohort.getStudents().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }
}
