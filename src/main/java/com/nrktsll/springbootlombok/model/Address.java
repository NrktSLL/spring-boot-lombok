package com.nrktsll.springbootlombok.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

@Value
@Builder
public class Address {

    @NonFinal
    @ToString.Exclude
    @Getter(value = AccessLevel.PROTECTED)
    @EqualsAndHashCode.Exclude
    Long Id;

    @Singular
    List<String> addresses;

}
