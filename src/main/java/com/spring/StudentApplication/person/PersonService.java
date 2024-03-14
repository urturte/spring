package com.spring.StudentApplication.person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();

    Person getById(long pid);

}
