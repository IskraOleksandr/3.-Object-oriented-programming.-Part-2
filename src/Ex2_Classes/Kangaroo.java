package Ex2_Classes;

import java.util.Scanner;

public class Kangaroo extends Animal {
    private int jumpHeight;

    public Kangaroo() {
        super("Кенгуру");
        this.jumpHeight = 0;
    }

    public Kangaroo(String name, int jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите висоту прыжка животного: ");
        jumpHeight = scanner.nextInt();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nВисота прыжка: ");
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}