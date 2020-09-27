package com.nrktsll.springbootlombok;

import com.nrktsll.springbootlombok.model.Address;
import com.nrktsll.springbootlombok.model.Person;
import com.nrktsll.springbootlombok.model.Staff;
import com.nrktsll.springbootlombok.model.Impl.PersonImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class SpringBootLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLombokApplication.class, args);

        var person = Person.builder()
                .Id(1L)
                .name("Nurkut")
                .surname("Sullu")
                .build();

        var staff = Staff.builder()
                .Id(person.getId())
                .name(person.getName())
                .surname(person.getSurname())
                .department("IT")
                .build();

        PersonImpl.getInstance().addPersonWithNonNull(person);

        System.out.println(staff);
        System.out.println("\n");

        var address = Address.builder()
                .address("Sivas")
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
