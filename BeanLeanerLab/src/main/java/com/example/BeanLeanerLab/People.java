package com.example.BeanLeanerLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private final List<PersonType> personList;


    private People(List<PersonType> personList){
        this.personList = personList;

    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType personTypeById){
    if (personList.contains(personTypeById)){
        personList.remove(personTypeById);
    }
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> person){
        ArrayList<PersonType> listOfLearners = new ArrayList<>();
        for(PersonType listLearners : person){
            listOfLearners.add(listLearners);
        }
    }

    public PersonType findById(Long id){
        for(PersonType person : personList){
            if(person.getId() == id){
                return person;
            }
        }return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
