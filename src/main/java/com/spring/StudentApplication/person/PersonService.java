package com.spring.StudentApplication.person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getAll();

    Optional<Person> getById(long pid);

}
