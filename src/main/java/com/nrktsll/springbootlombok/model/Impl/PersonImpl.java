package com.nrktsll.springbootlombok.model.Impl;

import com.nrktsll.springbootlombok.utils.MD5Generator;
import com.nrktsll.springbootlombok.service.PersonService;
import com.nrktsll.springbootlombok.model.Person;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.security.NoSuchAlgorithmException;

@Service
@Slf4j
@NoArgsConstructor(staticName = "getInstance", force = true)
public class PersonImpl implements PersonService {

    @Override
    public void addPersonWithNonNull(@NonNull Person person) {
        System.out.println(person);
        log.info(person + " Person added");

        try {
            var cryptoId = MD5Generator.getMD5(person.getId().toString());
            System.out.println("New ID: " + cryptoId);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //Data operations
    }

    @Override
    public void addPersonWithoutNonNull(Person person) {
        if (person == null) {
            throw new NullPointerException("WithNonNull");
        }
        //Data operations

        System.out.println(person);

    }
}
