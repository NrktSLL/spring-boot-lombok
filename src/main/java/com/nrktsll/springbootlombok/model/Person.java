package com.nrktsll.springbootlombok.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Data
@SuperBuilder
@With
public class Person {

    @NonNull
    @ToString.Exclude
    private Long Id;
    private String name;
    @ToString.Exclude
    private String surname;
    private Integer age;

    @ToString.Include
    public String surname() {
        return this.surname.toUpperCase();
    }
}

//    @Builder(builderMethodName = "PersonBuilder")
//    public static Person createInstance(Long Id, String Name,int Age) {
//        return new Person(Id, Name, "Sullu", Age);
//    }
