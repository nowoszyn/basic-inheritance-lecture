package pl.edu.wit;

import pl.edu.Mammal;

public class Tiger extends Mammal {
    public Tiger(final int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "tygrys";
    }
}
