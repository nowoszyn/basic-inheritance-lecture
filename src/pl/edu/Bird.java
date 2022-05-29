package pl.edu;

import pl.Animal;

public abstract class Bird extends Animal implements Flyable, Swimable {

    public Bird(int age) {
        super(age);
        System.out.println("Konstruktor bird");

    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public boolean canFly() {
        return true;
    }
}

// private
// default
// protected
// public
