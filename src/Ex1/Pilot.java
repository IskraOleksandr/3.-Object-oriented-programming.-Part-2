package Ex1;

import java.util.Scanner;

public class Pilot extends Human {
    private String aircraft;

    public Pilot() {
        super();
        this.aircraft = "Неизвестно";
    }

    public Pilot(String name, int age, String aircraft) {
        super(name, age);
        this.aircraft = aircraft;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Введите название самолета пилота: ");
        aircraft = scanner.nextLine();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Самолет пилота: " + aircraft);
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
}
