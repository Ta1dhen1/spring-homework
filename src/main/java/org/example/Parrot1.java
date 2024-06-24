package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Parrot1 implements Pet{
    private final String name;
    public Parrot1(@Value("${parrot1.name}") String name) {
        this.name = name;
    }
}
