package pl.edu.wit;

import pl.edu.Bird;

public class Eagle extends Bird {
    public Eagle(final int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "eagle";
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
