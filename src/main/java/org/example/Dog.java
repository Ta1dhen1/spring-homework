package org.example;

import lombok.Getter;

@Getter
public class Dog implements Pet{
    private final String name;

    public Dog(String name) {
        this.name = name;
    }
}
