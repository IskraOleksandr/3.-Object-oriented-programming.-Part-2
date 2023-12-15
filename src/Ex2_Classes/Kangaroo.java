package Ex2_Classes;

import java.util.Scanner;

public class Kangaroo extends Animal {


    public Kangaroo(String name, int age, double weight) {
        super.name = name;
        super.age = age;
        super.weight = weight;
    }

    @Override
    protected String go() {
        return "Я могу быстро прыгать";
    }
}