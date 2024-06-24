package org.example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Getter
    @Value("${human.name}")
    private String name;
    Pet cat;
    Pet dog;
    Pet parrot1;
    Pet parrot2;
    @Autowired
    public Human(@Qualifier("cat") Pet cat, @Qualifier("dog") Pet dog, @Qualifier("parrot1") Pet parrot1,
                 @Qualifier("parrot2") Pet parrot2){
        this.cat = cat;
        this.dog = dog;
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
    }

}
