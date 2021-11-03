package com.example;

import com.example.model.Animal;
import com.example.model.Cat;
import com.example.model.Dog;

public enum AnimalType {
    DOG {
        @Override
        Animal createAnimal() {
            return new Dog();
        }
    },
    CAT {
        @Override
        Animal createAnimal() {
            return new Cat();
        }
    };

    abstract Animal createAnimal();
}
