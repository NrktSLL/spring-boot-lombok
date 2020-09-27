package com.nrktsll.springbootlombok.service;

import com.nrktsll.springbootlombok.model.Person;

public interface PersonService {

    void addPersonWithNonNull(Person person);

    void addPersonWithoutNonNull(Person person);
}
