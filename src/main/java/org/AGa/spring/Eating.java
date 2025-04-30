package org.AGa.spring;

public class Eating implements Process {

    private Animal animal;

    public Eating(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {
        System.out.println(animal.getOwner().getName() + "'s " + animal.getClass().getSimpleName() + " says: " + animal.getVoice());
        animal.eat();
        System.out.println(animal.getOwner().getName() + " is feeding the animal");
    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
