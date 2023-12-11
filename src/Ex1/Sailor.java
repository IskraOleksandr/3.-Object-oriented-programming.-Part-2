package Ex1;

import java.util.Scanner;

public class Sailor extends Human {
    private String rank;

    public Sailor() {
        super();
        this.rank = "Неизвестно";
    }

    public Sailor(String name, int age, String rank) {
        super(name, age);
        this.rank = rank;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Введите ранг моряка: ");
        rank = scanner.nextLine();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ранг моряка: " + rank);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
