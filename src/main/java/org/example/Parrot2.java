package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Parrot2 implements Pet{
    private final String name;
    public Parrot2(@Value("${parrot2.name}") String name) {
        this.name = name;
    }
}
