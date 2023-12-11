package Ex2_Classes;

import java.util.Scanner;

public class Tiger extends Animal {
    private int speed;

    public Tiger() {
        super("Тигр");
        this.speed = 0;
    }

    public Tiger(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите скорость животного: ");
        speed = scanner.nextInt();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\nСкорость тигра: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}