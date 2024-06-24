package org.example;

import lombok.Getter;

@Getter
public class Parrot implements Pet{
    private final String name;

    public Parrot(String name) {
        this.name = name;
    }
}
