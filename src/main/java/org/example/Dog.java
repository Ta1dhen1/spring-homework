package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Dog implements Pet{
    private final String name;
    public Dog(@Value("${dog.name}") String name) {
        this.name = name;
    }
}