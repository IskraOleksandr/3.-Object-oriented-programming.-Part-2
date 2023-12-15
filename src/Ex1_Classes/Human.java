package Ex1_Classes;

import java.util.Scanner;

public abstract class Human {
    protected String name;
    protected int age;

    protected abstract String work();

    public void print() {
        System.out.println("\nМеня зовут: " + name + work() +
                "\nМой возраст: " + age);

    }

}
