package pl;

import pl.edu.Bird;
import pl.edu.wit.Bat;
import pl.edu.wit.Cat;

public class App {

    public static void main(String[] args) {

//        System.out.println("animal");
//        Animal animal = new Animal(10);
//        System.out.println(animal.getAge());

//        System.out.println("bird");
//        Bird bird = new Bird(10);
//        System.out.println(bird.getAge());

        System.out.println("cat");
        Cat cat = new Cat(10);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());

        System.out.println("bat");
        Bat bat = new Bat(15);
        System.out.println(bat.getAge());
        System.out.println(bat.getName());

    }
}
