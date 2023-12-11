package Ex2_Classes;

import java.util.Scanner;

public class Animal {
    private String name;

    public Animal() {
        this.name = "Животное";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите название животного: ");
        name = scanner.nextLine();
    }

    public void print() {
        System.out.println("\nНазвание животного: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
