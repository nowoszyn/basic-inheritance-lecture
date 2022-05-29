package pl;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        super();
        System.out.println("Konstruktor animal");
        this.age = age;
    }

    protected int getAge() {
        return age;
    }

    public abstract String getName();

//    public void setAge(final int age) {
//        this.age = age;
//    }

}
