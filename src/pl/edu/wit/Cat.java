package pl.edu.wit;

import pl.edu.Mammal;

public class Cat extends Mammal {

    public Cat(final int age) {
        super(age);
        System.out.println("Konstruktor cat");
    }

    @Override
    public int getAge() {
        return super.getAge() * 7;
    }

    @Override
    public String getName() {
        return "Kot";
    }
}
