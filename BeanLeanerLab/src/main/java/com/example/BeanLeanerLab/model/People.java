package com.example.BeanLeanerLab.model;

import java.util.*;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    protected List<PersonType> personList;


    public People() {
        this(new ArrayList<>());
    }


    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType[] personArray) {
        List<PersonType> unmodifiableList = Arrays.asList(personArray);
        List<PersonType> modifiableList = new ArrayList<>(unmodifiableList);
        this.personList = modifiableList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType personTypeById) {
        if (personList.contains(personTypeById)) {
            personList.remove(personTypeById);
        }
    }

    public Integer size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> person) {
        ArrayList<PersonType> listOfLearners = new ArrayList<>();
        for (PersonType listLearners : person) {
            listOfLearners.add(listLearners);
        }
    }

    public PersonType findById(Long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {
        personList.forEach(action);
    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return personList.spliterator();
    }

    public boolean containsAll(String[] personNames) {
        List<String> personListNames = new ArrayList<>();
        for(Person person : personList) {
            String name = person.name;
            personListNames.add(name);
        }
        return personListNames.containsAll(Arrays.asList(personNames));
    }
}
