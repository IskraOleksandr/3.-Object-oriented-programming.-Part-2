package Ex1;

import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Неизвестно";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите имя: ");
        name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        age = scanner.nextInt();

    }

    public void print() {
        System.out.println("\nИмя: " + name + "\nВозраст: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
