package Ex2_Classes;

import java.util.Scanner;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    protected abstract String go();

    public void print() {
        System.out.println("\n" + name + ": " + go() +
                "\nМой возраст: " + age + "\nМой вес: " + weight);
    }

}
