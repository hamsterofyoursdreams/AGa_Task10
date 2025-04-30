package org.AGa.spring;

public class Cat implements Animal {
    private Human owner;

    @Override
    public String getVoice() {
        return "Meaou";
    }

    @Override
    public void eat() {
        System.out.println("I eat mice");
    }

    @Override
    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
