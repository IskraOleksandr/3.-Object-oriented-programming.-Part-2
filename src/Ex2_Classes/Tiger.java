package Ex2_Classes;

import java.util.Scanner;

public class Tiger extends Animal {

    public Tiger(String name, int age, double weight) {
        super.name = name;
        super.age = age;
        super.weight = weight;
    }

    @Override
    protected String go() {
        return "Я быстро бегаю";
    }

}