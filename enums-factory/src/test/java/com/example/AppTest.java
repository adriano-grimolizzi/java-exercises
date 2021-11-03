package com.example;

import com.example.model.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void shouldCreateAnimals() {
        Animal dog = AnimalType.DOG.createAnimal();
        assertEquals("Bau Bau!", dog.speak());
        Animal cat = AnimalType.CAT.createAnimal();
        assertEquals("Miao!", cat.speak());
    }
}
