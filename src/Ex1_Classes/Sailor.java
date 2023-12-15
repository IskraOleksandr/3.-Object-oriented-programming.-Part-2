package Ex1_Classes;

import java.util.Scanner;

public class Sailor extends Human {

    public Sailor() {
        super();
    }

    public Sailor(String name, int age) {
        super.name = name;
        super.age = age;
    }

    public String work() {
        return "\nЯ продавец!";
    }
}
