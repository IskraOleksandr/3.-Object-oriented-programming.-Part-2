package Ex2_Classes;

import java.util.Scanner;

public class Crocodile extends Animal {
    private int length;

    public Crocodile() {
        super("Крокодил");
        this.length = 0;
    }

    public Crocodile(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите длину животного: ");
        length = scanner.nextInt();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nДлина: " + length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}