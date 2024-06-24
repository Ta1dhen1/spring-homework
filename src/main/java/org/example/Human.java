package org.example;

import lombok.Getter;
import lombok.Setter;

public class Human {
    @Setter
    @Getter
    private String name;
    Pet cat;
    Pet dog;
    Pet parrot1;
    Pet parrot2;
    public Human(Pet cat, Pet dog, Pet parrot1, Pet parrot2){
        this.cat = cat;
        this.dog = dog;
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
    }


}
