package oops;

public class Child extends Parent {
    public String surname;

    public Child(String surname) {
        super("suman");
        this.surname = surname;
        System.out.println(surname);
    }
}
