package Ex1_Classes;

import java.util.Scanner;

public class Pilot extends Human {

    public Pilot() {
        super();
    }

    public Pilot(String name, int age) {
        super.name = name;
        super.age = age;
    }

    public String work() {
        return "\nЯ управляю самолетом!";
    }
}
