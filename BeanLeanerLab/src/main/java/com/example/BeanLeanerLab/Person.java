package com.example.BeanLeanerLab;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Person {
    final Long id;
    public String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
