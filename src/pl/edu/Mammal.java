package pl.edu;

import pl.Animal;

public abstract class Mammal extends Animal implements Swimable {
    public Mammal(final int age) {
        super(age);
        System.out.println("Konstruktor mammal");
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
