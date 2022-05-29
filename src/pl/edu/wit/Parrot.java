package pl.edu.wit;

import pl.edu.Bird;

public class Parrot extends Bird {
    public Parrot(final int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "parrot";
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
