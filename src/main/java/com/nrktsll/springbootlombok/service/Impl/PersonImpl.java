package com.nrktsll.springbootlombok.service.Impl;

import com.nrktsll.springbootlombok.model.Person;
import com.nrktsll.springbootlombok.service.MailService;
import com.nrktsll.springbootlombok.service.PersonService;
import com.nrktsll.springbootlombok.utils.MD5Generator;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
@Slf4j
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName = "getInstance")
public class PersonImpl implements PersonService {

    MailService mailService;

    @Override
    public void addPersonWithNonNull(@NonNull Person person) {
        System.out.println(person);
        log.info(person + " Person added");

        mailService.sendMail();

        try {
            var cryptoId = MD5Generator.getMD5(person.getId().toString());
            System.out.println(MD5Generator.NAME);
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
