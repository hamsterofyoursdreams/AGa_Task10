package org.AGa.spring;

import org.AGa.spring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Human vasya() {
        return new Vasya();
    }

    @Bean
    public Human masha() {
        return new Masha();
    }

    @Bean
    public Animal dog() {
        Dog dog = new Dog();
        dog.setOwner(masha()); // Связываем с владельцем Машей
        return dog;
    }

    @Bean
    public Animal cat() {
        Cat cat = new Cat();
        cat.setOwner(vasya()); // Связываем с владельцем Васей
        return cat;
    }

    @Bean
    public Process eatingProcess() {
        return new Eating(cat());
    }

    @Bean
    public Process walkingProcess() {
        Walking walking = new Walking();
        walking.setAnimal(dog());
        return walking;
    }
}
