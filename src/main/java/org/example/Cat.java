package org.example;

import com.sun.security.auth.NTSid;
import lombok.Getter;
import lombok.Setter;

import java.security.PublicKey;
import java.util.function.DoubleToIntFunction;

@Getter
public class Cat implements Pet {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

}
