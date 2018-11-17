package test.workshop.safecode;

public class Person {

    private String name;

    public Person(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }
}
