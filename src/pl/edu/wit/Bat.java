package pl.edu.wit;

import pl.edu.Flyable;
import pl.edu.Mammal;

public class Bat extends Mammal implements Flyable {
    public Bat(final int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "nietoperz";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
