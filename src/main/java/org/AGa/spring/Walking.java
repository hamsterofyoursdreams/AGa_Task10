package org.AGa.spring;


public class Walking implements Process {

    private Animal animal;

    @Override
    public void run() {
        System.out.println(animal.getOwner().getName() + "'s " + animal.getClass().getSimpleName() + " says: " + animal.getVoice());
        System.out.println(animal.getOwner().getName() + " is walking with " + animal.getClass().getSimpleName());
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
