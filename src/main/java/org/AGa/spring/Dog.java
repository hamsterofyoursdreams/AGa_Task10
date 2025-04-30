package org.AGa.spring;

public class Dog implements Animal {
    private Human owner;

    @Override
    public String getVoice() {
        return "Hab";
    }

    @Override
    public void eat() {
        System.out.println("I eat bones");
    }

    @Override
    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}