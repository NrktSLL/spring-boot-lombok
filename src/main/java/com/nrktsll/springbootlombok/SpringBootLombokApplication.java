package com.nrktsll.springbootlombok;

import com.nrktsll.springbootlombok.model.Address;
import com.nrktsll.springbootlombok.model.Person;
import com.nrktsll.springbootlombok.model.Staff;
import com.nrktsll.springbootlombok.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootLombokApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootLombokApplication.class, args);
        PersonService personService = context.getBean(PersonService.class);

        var person = Person.builder()
                .Id(1L)
                .name("Nurkut")
                .surname("Sullu")
                .build();

        var personWithExample = new Person().withId(1L).withAge(25).withName("Suayb").withSurname("Test");
        personWithExample.withId(2L).withAge(24);

        System.out.println(personWithExample);

        var staff = Staff.builder()
                .Id(person.getId())
                .name(person.getName())
                .surname(person.getSurname())
                .department("IT")
                .build();

        personService.addPersonWithNonNull(person);

        System.out.println(staff);
        System.out.println("\n");

        var address = Address.builder()
                .address("Sivas")
                .address("İzmir")
                .addresses(List.of("İstanbul", "Aydın"))
                .build();

        System.out.println(address);
        System.out.println("\n");

        var person1 = new Person();
        var person2 = new Person();
        person1.setId((long) 1);
        person2.setId((long) 1);

        System.out.println("person1 HashCode: " + person1.hashCode());
        System.out.println("person2 HashCode: " + person2.hashCode() + "\n");

        if (person1.equals(person2))
            System.out.println("person1 = person2");
    }
}
