package Ex1_Classes;

import java.util.Scanner;

public class Builder extends Human {
    private String specialization;

    public Builder() {
        super();
        this.specialization = "Неизвестно";
    }

    public Builder(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Введите специализацию строителя: ");
        specialization = scanner.nextLine();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Специализация строителя: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
