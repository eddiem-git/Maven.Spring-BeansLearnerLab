package com.example.BeanLeanerLab;

import com.example.BeanLeanerLab.model.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    Classroom currentClassroom;

    @Autowired
    Classroom previousClassroom;

    @Test
    public void checkCurrentClassroomSize(){
        Integer expectedCurrentSize = 7;
        Integer expectedPreviousSize = 4;

        Integer actualCurrentSize = currentClassroom.getStudents().size();
        Integer actualPreviousSize = currentClassroom.getInstructors().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }

    @Test
    public void checkPreviousClassroomSize(){
        Integer expectedCurrentSize = 4;
        Integer expectedPreviousSize = 4;

        Integer actualCurrentSize = previousClassroom.getInstructors().size();
        Integer actualPreviousSize = previousClassroom.getInstructors().size();

        Assert.assertEquals(expectedCurrentSize,actualCurrentSize);
        Assert.assertEquals(expectedPreviousSize,actualPreviousSize);
    }
}
