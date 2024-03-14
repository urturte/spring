package com.spring.StudentApplication.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository repository;
    @Autowired
    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Person> getAll() {
        List<Person> list = new ArrayList<>(repository.findAll());
        return list;
    }
    @Override
    public Optional<Person> getById(long pid){
        Optional<Person> person = repository.findById(pid);
        return person;
    }

}
