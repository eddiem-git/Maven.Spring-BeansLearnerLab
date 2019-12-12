package com.example.BeanLeanerLab.configuration;
import com.example.BeanLeanerLab.model.Instructor;
import com.example.BeanLeanerLab.model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean(name = "UsaInstructors")
   public Instructors tcUsaInstructors(){
        return createInstructors(new String[]{"Leon", "Tariq", "Kris"});
   }
    @Bean(name = "UkInstructors")
   public Instructors tcUkInstructors(){
        return createInstructors(new String[]{"John", "Joe", "Jacob"});
   }

   @Bean(name = "instructors")
   @Primary
    public Instructors instructors(){
        return createInstructors(new String[]{"Froilan", "Chris", "Kris"});
   }

    private Instructors createInstructors(String[] names) {
        Instructors instructors = new Instructors();
        for (Integer id = 0; id < names.length; id++) {
            String name = names[id];
            Instructor newInstructor = new Instructor(id.longValue(), name);
            instructors.add(newInstructor);
        }
        return instructors;
    }
}