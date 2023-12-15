package Ex1_Classes;

import java.util.Scanner;

public class Builder extends Human {

    public Builder() {
        super();
    }

    public Builder(String name, int age) {
        super.name = name;
        super.age = age;
    }

    public String work() {
        return "\nЯ строю дома!";
    }

}
