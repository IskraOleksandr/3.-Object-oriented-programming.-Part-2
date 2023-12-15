package Ex2_Classes;

import java.util.Scanner;

public class Crocodile extends Animal {

    public Crocodile(String name, int age, double weight) {
        super.name = name;
        super.age = age;
        super.weight = weight;
    }

    @Override
    protected String go() {
        return "Я могу бегать и плавать";
    }

}